package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Order {
    String time;
    int[] pizzaNr;
    String[] pizzaNavn;
    int[] pris;

    public Order(String time, int[] pizzaNr, String[] pizzaNavn, int[] pris) {
        this.time = time;
        this.pizzaNr = pizzaNr;
        this.pizzaNavn = pizzaNavn;
        this.pris = pris;
    }

    public String printOrder() {
        return String.format("time: %s, pizzaNr: %s, pizzaNavn: %s, pris: %s", this.time, Arrays.toString(this.pizzaNr), Arrays.toString(this.pizzaNavn), Arrays.toString(this.pris));
    }

    public static Order[] makeOrder(Scanner input, Pizza[] pizzaMenu, Pizza[] order, Order[] orderlist, int i) {
        System.out.println("Afhentningstidspunkt");
        String Time = input.nextLine();
        int[] PizzaNr = new int[50];
        String[] PizzaNavn = new String[50];
        int[] pizzaPris = new int[50];
        String answer = "";
        int count = 0;

        do {
            System.out.println("Indtast pizza nummer til bestilling");
            int PizzaNummer = input.nextInt();
            input.nextLine();
            if (PizzaNummer < 15) {
                PizzaNr[count] = PizzaNummer;
                PizzaNavn[count] = pizzaMenu[PizzaNummer - 1].pizzaNavn;
                pizzaPris[count] = pizzaMenu[PizzaNummer - 1].pris;
                System.out.println("Er du færdig?");
                answer = input.next();
            } else {
                Pizza.lavPizza(input, order, i);
                PizzaNr[count] = PizzaNummer;
                PizzaNavn[count] = order[i].toppings;
                pizzaPris[count] = order[i].pris;
                ++i;
                System.out.println("Er du færdig?");
                answer = input.next();
            }

            ++count;
        } while(!answer.equalsIgnoreCase("Ja"));

        Order o1 = new Order(Time, PizzaNr, PizzaNavn, pizzaPris);

        for(int k = 0; k < orderlist.length; ++k) {
            if (orderlist[k] == null) {
                orderlist[k] = o1;
                break;
            }
        }

        return orderlist;
    }

    public static void printOrders(Order[] orderlist) {
        int totalPris = 0;

        for(int i = 0; i < orderlist.length; ++i) {
            if (orderlist[i] != null) {
                for(int k = 0; k < orderlist[i].pris[k]; ++k) {
                    totalPris += orderlist[i].pris[k];
                }

                System.out.println(i + 1 + ": " + orderlist[i]);
                System.out.println("Total pris: " + totalPris);
                totalPris = 0;
            }
        }

    }

    public static Order[] afslutOrder(Order[] orderlist, Scanner input) {
        int slet;
        for(slet = 0; slet < orderlist.length; ++slet) {
            if (orderlist[slet] != null) {
                System.out.println(slet + 1 + ": " + orderlist[slet]);
            }
        }

        System.out.println("Hvilken bestilling skal slettes?");
        slet = input.nextInt();
        System.out.println("Tryk 1 for afslutte bestilling\nTryk 2 for at annullere bestilling");
        int answer = input.nextInt();

        for(int i = 1; i < orderlist.length; ++i) {
            if (slet == i) {
                if (answer == 1) {
                    try {
                        FilHaandtering.writeToFile("./marios_pizzabar_accounting.txt", orderlist[slet - 1].printOrder());
                    } catch (Exception var7) {
                        System.out.println("nope");
                    }
                }

                orderlist[slet - 1] = null;
            }
        }

        Order[] newOrderList = new Order[orderlist.length];
        int nSkipped = 0;

        for(int idx = 0; idx < orderlist.length; ++idx) {
            if (orderlist[idx] != null) {
                newOrderList[idx - nSkipped] = orderlist[idx];
            } else {
                ++nSkipped;
            }
        }

        return newOrderList;
    }

    public String toString() {
        String[] order = new String[10];
        String newOrder = "";
        String stringNavne = "";

        for(int i = 0; i < order.length; ++i) {
            if (this.pizzaNavn[i] != null) {
                stringNavne = this.pizzaNavn[i];
                int pizzaNumre = this.pizzaNr[i];
                int pizzaPris = this.pris[i];
                order[i] = pizzaNumre + ". " + stringNavne + "......." + pizzaPris + "kr.";
            }

            if (order[i] != null) {
                newOrder = newOrder + order[i] + "\n";
            }
        }

        return newOrder + "Klar kl: " + this.time;
    }
}
