package com.company;

import java.util.*;

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
        return pizzaNr + ". " + pizzaNavn + ": " + toppings + "............" + pris;
    }

    public static void seMenu(Pizza[] pizzaMenu) {
        for (int i = 0; i < pizzaMenu.length; i++) {
            if (pizzaMenu[i] != null) {
                System.out.println(pizzaMenu[i]);
            }
        }
    }
    public static Pizza[] lavPizza(Scanner input, Pizza[] order) {
        Pizza p15 = new Pizza("lav selv", input.nextLine(), input.nextInt(), 15);
        for (int i = 0; i < order.length; i++) {
            if (order[i] == null) {
                order[i] = p15;
            }
        }
        return order;
    }
}
    /*public static Pizza[] lavPizza(Scanner input, Pizza[] order) {
        System.out.println("Hvilke toppings skal pizzaen have");
        String lavToppings = input.nextLine();
        input.nextLine();
        System.out.println("Indtast pris for pizzaen");
        int lavPris = input.nextInt();
        Pizza p15 = new Pizza("Lav selv", "tomatsauce, ost, " + lavToppings + ", oregano", lavPris, 15);
        for (int i = 0; i < order.length; i++) {
            if (order[i] == null) {
                order[i] = p15;
            }
        }
        return order;
    }*/
