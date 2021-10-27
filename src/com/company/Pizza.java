package com.company;
import java.util.*;

public class Pizza {
    String pizzaNavn;
    String toppings;
    int pris;
    int pizzaNr;

    public Pizza(String pizzaNavn, String toppings, int pris, int pizzaNr){
        this.pizzaNavn = pizzaNavn;
        this.toppings = toppings;
        this.pris = pris;
        this.pizzaNr = pizzaNr;
    }
    public String toString(){
        return pizzaNr + ". " + pizzaNavn + ": " + toppings + "............" + pris;
    }
    public static Pizza lavPizza(Scanner input){
        System.out.println("Hvilke toppings skal pizzaen have");
        String lavToppings = input.nextLine();
        System.out.println("Indtast pris for pizzaen");
        int lavPris = input.nextInt();
        Pizza p1 = new Pizza("Lav selv","tomatsauce, ost, " + lavToppings + ", oregano", lavPris, 15);
        System.out.println(p1);
        return p1;
    }
}
