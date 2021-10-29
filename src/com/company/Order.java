package com.company;
import java.util.*;

public class Order {
    String time;
    int[] pizzaNr;
    String[] pizzaNavn;
    public static int[] pris;

    public Order(String time, int[] pizzaNr, String[] pizzaNavn, int[] pris) {
        this.time = time;
        this.pizzaNr = pizzaNr;
        this.pizzaNavn = pizzaNavn;
        this.pris = pris;
    }

    public static Order[] makeOrder(Scanner input, Pizza[] pizzaMenu, Pizza[] order, Order[] orderlist) {
        System.out.println("Afhentnings tidspunkt");
        String Time = input.nextLine();
        int[] PizzaNr = new int[50];
        String[] PizzaNavn = new String[50];
        int[] pizzaPris = new int[50];
        int PizzaNummer = 0;
        String answer = "";
        int count = 0;
        int i = 0;
        do {
            System.out.println("Indtast pizza nummer til bestilling");
            PizzaNummer = input.nextInt();
            input.nextLine();
            if (PizzaNummer < 15) {
                PizzaNr[count] = PizzaNummer;
                PizzaNavn[count] = pizzaMenu[PizzaNummer - 1].pizzaNavn;
                pizzaPris[count] = pizzaMenu[PizzaNummer - 1].pris;
                count++;
                System.out.println("Er du færdig?");
                answer = input.next();
            } else {
                Pizza.lavPizza(input, order);
                PizzaNr[count] = PizzaNummer;
                PizzaNavn[count] = order[i].toppings;
                pizzaPris[count] = order[i].pris;
                count++;
                i++;
                System.out.println("Er du færdig?");
                answer = input.next();
            }
        } while (!answer.equalsIgnoreCase("Ja"));
        Order o1 = new Order(Time, PizzaNr, PizzaNavn, pizzaPris);
        for (int k = 0; k < orderlist.length; k++) {
            if (orderlist[k] == null) {
                orderlist[k] = o1;
                break;
            }
        }
        return orderlist;
    }
    public static void printOrders(Order[] orderlist){
        int totalPris = 0;
        for(int i = 0; i < orderlist.length; i++){
            if(orderlist[i] != null) {
                System.out.println(i + 1 + ": " + orderlist[i]);
            }
            if(orderlist[i].pris[i] != 0){
                totalPris += orderlist[i].pris[i];
            }
        }
        System.out.println(totalPris);
    }
    public static Order[] afslutOrder(Order[] orderlist, Scanner input){
        for(int i = 0; i < orderlist.length; i++) {
            if (orderlist[i] != null) {
                System.out.println(i + 1 + ": " + orderlist[i]);
            }
        }
        System.out.println("Hvilken bestilling skal slette?");
        int slet = input.nextInt();
        int answer;
        System.out.println("Tryk 1 for afslutte bestilling\nTryk 2 for at annullere bestilling");
        answer = input.nextInt();
        if(answer == 1){
            //Send over til fil
        }
        for(int i = 1; i < orderlist.length; i++){
            if(slet == i){
                orderlist[slet - 1] = null;
            }
        }
        return orderlist;
    }

    public String toString() {
        String[] order = new String[10];
        String newOrder = "";
        String stringNavne = "";
        int pizzaNumre = 0;
        int pizzaPris = 0;
        for (int i = 0; i < order.length; i++) {
            if (pizzaNavn[i] != null) {
                stringNavne = pizzaNavn[i];
                pizzaNumre = pizzaNr[i];
                pizzaPris = pris[i];
                order[i] = pizzaNumre + ". " + stringNavne + "......." + pizzaPris + "kr.";
            }
            if (order[i] != null) {
                newOrder += order[i] + "\n";
            }
        }
        return newOrder + "Klar kl: " + time;
    }
}
/*switch(answer){
        case 1:
        orderlist[answer - 1] = null;
        break;
        case 2:
        orderlist[answer - 1] = null;
        break;
        case 3:
        orderlist[answer - 1] = null;
        break;
        case 4:
        orderlist[answer - 1] = null;
        break;
        case 5:
        orderlist[answer - 1] = null;
        break;
        case 6:
        orderlist[answer - 1] = null;
        break;
        case 7:
        orderlist[answer - 1] = null;
        break;
        case 8:
        orderlist[answer - 1] = null;
        break;
        case 9:
        orderlist[answer - 1] = null;
        break;
        case 10:
        orderlist[answer - 1] = null;
        break;
default
                break;*/
