//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Statistik {
    int oms;
    String pop;
    public Statistik(int oms, String pop) {
        this.oms = oms;
        this.pop = pop;
    }
    public static Statistik getStats() throws FileNotFoundException {
        File myObj = new File("./marios_pizzabar_accounting.txt");
        Scanner myReader = new Scanner(myObj);
        int penge = 0;
        String pizza = "";
        while(myReader.hasNextInt()){
            penge += myReader.nextInt();
        }
        while(myReader.hasNextLine()){
            pizza = myReader.nextLine() + " ";
        }
        Statistik s1 = new Statistik(penge, pizza);
        System.out.println(s1);
        return s1;
    }
    public String toString(){
        return "Omsætning for dagen: " + oms + "\n" + "Populæreste pizza for dagen: " + pop;
    }

    public void readFile() {
        try {
            File myObj = new File("./marios_pizzabar_accounting.txt");
            Scanner myReader = new Scanner(myObj);

            while(myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }

            myReader.close();
        } catch (FileNotFoundException var4) {
            System.out.println("An error occurred.");
            var4.printStackTrace();
        }

    }
}
