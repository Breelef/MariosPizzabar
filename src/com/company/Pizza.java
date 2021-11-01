//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.util.Scanner;

public class Pizza {
    String pizzaNavn;
    String toppings;
    int pris;
    int pizzaNr;

    public Pizza(String pizzaNavn, String toppings, int pris, int pizzaNr) {
        this.pizzaNavn = pizzaNavn;
        this.toppings = toppings;
        this.pris = pris;
        this.pizzaNr = pizzaNr;
    }

    public String toString() {
        return this.pizzaNr + ". " + this.pizzaNavn + ": " + this.toppings + "............" + this.pris;
    }

    public static void seMenu(Pizza[] pizzaMenu) {
        for(int i = 0; i < pizzaMenu.length; ++i) {
            if (pizzaMenu[i] != null) {
                System.out.println(pizzaMenu[i]);
            }
        }

    }

    public static Pizza[] lavPizza(Scanner input, Pizza[] order, int count) {
        System.out.println("Hvilke toppings skal pizzaen have?");
        String toppings = input.nextLine();
        System.out.println("Prisen for pizzaen");
        int pris = input.nextInt();
        Pizza p15 = new Pizza("lav selv", "tomatsauce, ost, " + toppings + ", oregano", pris, 15);
        order[count] = p15;
        ++count;
        return order;
    }
}
