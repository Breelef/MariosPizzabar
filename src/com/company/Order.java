package com.company;
import java.util.*;

public class Order {
    String time;
    int[] pizzaNr;
    String[] pizzaNavn;
    int[] pris;
    public Order(String time, int[] pizzaNr, String[] pizzaNavn, int[] pris){
        this.time = time;
        this.pizzaNr = pizzaNr;
        this.pizzaNavn = pizzaNavn;
        this.pris = pris;
    }
    public static Order makeOrder(Scanner input, Pizza[] pizzaMenu){
        System.out.println("Hvornår skal pizzaen være klar til?");
        int Hour = input.nextInt();
        int Minute = input.nextInt();
        String Time = Hour + ":" + Minute;
        int[] PizzaNr = new int[50];
        String[] PizzaNavn = new String[50];
        int[] pizzaPris = new int[50];
        int PizzaNummer = 0;
        String answer = "";
        int count = 0;
        do{
            System.out.println("Hvilke pizzaer er blevet bestilt?");
            PizzaNummer = input.nextInt();
            PizzaNr[count] = PizzaNummer;
            PizzaNavn[count] = pizzaMenu[PizzaNummer - 1].pizzaNavn;
            pizzaPris[count] = pizzaMenu[PizzaNummer - 1].pris;
            count++;
            System.out.println("Er du færdig?");
            answer = input.next();
        }while(!answer.equalsIgnoreCase("Nej"));
        Order o1 = new Order(Time, PizzaNr, PizzaNavn, pizzaPris);
        System.out.println(o1);
        return o1;
    }
    public String toString(){
        String[] order = new String[10];
        String newOrder = "";
        String stringNavne = "";
        int pizzaNumre = 0;
        int pizzaPris = 0;
        for(int i = 0; i < order.length; i++){
            if(pizzaNavn[i] != null) {
                stringNavne = pizzaNavn[i];
                pizzaNumre = pizzaNr[i];
                pizzaPris = pris[i];
                order[i] = pizzaNumre + ". " + stringNavne + "......." + pizzaPris + "kr.";
            }
            if(order[i] != null) {
                newOrder += order[i] + "\n";
            }
        }
            return newOrder + "Klar kl: " + time;
    }
}
