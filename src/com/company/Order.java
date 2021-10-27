package com.company;
import java.util.*;

public class Order {
    String time;
    int[] pizzaNr;
    String[] pizzaNavn;
    public Order(String time, int[] pizzaNr, String[] pizzaNavn){
        this.time = time;
        this.pizzaNr = pizzaNr;
        this.pizzaNavn = pizzaNavn;
    }
    public String toString(){
        return pizzaNr + " " + pizzaNavn + "\nKlar kl: " + time;
    }
    public Order makeOrder(Scanner input){
        System.out.println("Hvornår skal pizzaen være klar til?");
        int Hour = input.nextInt();
        int Minute = input.nextInt();
        String Time = Hour + ":" + Minute;
        System.out.println("Hvilke pizzaer er blevet bestilt?");
        int[] PizzaNr = new int[50];
        String[] PizzaNavn = new String[50];
        int count = 0;
        String answer;
        do{
            PizzaNr[count] = input.nextInt();
            PizzaNavn[count] = input.nextLine();
            System.out.println("Vil du indtaste flere pizzaer?");
            String answer = input.next();
        }while(!answer.equalsIgnoreCase("Nej"));
    }
}
