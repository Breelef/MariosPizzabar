package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pizza[] pizzaMenu = new Pizza[14];
        Pizza.seMenu(lavPizzaMenu(pizzaMenu));
        Pizza.lavPizza(input);

        int menu = 5;
            while(menu !=4){
                System.out.println("Tryk 1 for se menukort");
                System.out.println("Tryk 2 for tilføj pizza til ordre");
                System.out.println("Tryk 3 for at lave din egen pizza");
                System.out.println("Tryk 4 for");
                menu = input.nextInt();
                switch (menu){
                    case 1:
                    pizzaMenu();
                        break;
                    case 2:

                        break;
                    case 3:
                    Pizza.lavPizza(Scanner input);
                        break;
                    case 4:

                        break;
                    default:
                        System.out.print("BuFu/Karstens søn + Emil (Stedsøn)");
                }
            }
-    }
    public static Pizza[] lavPizzaMenu(Pizza[] pizzaMenu) {
        Pizza p1 = new Pizza("Vesuvio", "Tomatsauce, ost, skinke, oregano", 57, 1);
        Pizza p2 = new Pizza("Amerikaner", "Tomatsauce, ost, oksefars, oregano", 53, 2);
        Pizza p3 = new Pizza("Cacciatore", "Tomatsauce, ost, pepperoni, oregano", 57, 3);
        Pizza p4 = new Pizza("Carbona", "Tomatsauce, ost, kødsovs, spaghetti, cocktailpølser, oregano", 63, 4);
        Pizza p5 = new Pizza("Dennis", "Tomatsauce, ost, skinke, cocktailpølser, oregano", 65, 5);
        Pizza p6 = new Pizza("Bertil", "Tomatsauce, ost, bacon, oregano", 57, 6);
        Pizza p7 = new Pizza("Silvia", "Tomatsauce, ost, pepperoni, rød peber, løg, oliven, oregano", 61, 7);
        Pizza p8 = new Pizza("Victioria", "Tomatsauce, ost, skinke, annanas, løg, champignon, oregano", 61, 8);
        Pizza p9 = new Pizza("Toronfo", "Tomatsauce, ost, skinke, bacon, kebab, chili, oregano", 61, 9);
        Pizza p10 = new Pizza("Capricciosa", "Tomatsauce, ost, skinke,champignon, oregano", 61, 10);
        Pizza p11 = new Pizza("Hawai", "Tomatsauce, ost, skinke, annanas, oregano", 61, 11);
        Pizza p12 = new Pizza("Le Blissoa", "Tomatsauce, ost, skinke, rejer, oregano", 61, 12);
        Pizza p13 = new Pizza("Venezia", "Tomatsauce, ost, bacon, oregano", 61, 13);
        Pizza p14 = new Pizza("Mafia", "Tomatsauce, ost, pepperoni, bacon, oregano", 61, 14);
        pizzaMenu[0] = p1;
        pizzaMenu[1] = p2;
        pizzaMenu[2] = p3;
        pizzaMenu[3] = p4;
        pizzaMenu[4] = p5;
        pizzaMenu[5] = p6;
        pizzaMenu[6] = p7;
        pizzaMenu[7] = p8;
        pizzaMenu[8] = p9;
        pizzaMenu[9] = p10;
        pizzaMenu[10] = p11;
        pizzaMenu[11] = p12;
        pizzaMenu[12] = p13;
        pizzaMenu[13] = p14;
        return pizzaMenu;
    }
}
