package com.company;

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
}
