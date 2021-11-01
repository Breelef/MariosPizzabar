//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Statistik {
    public Statistik() {
    }

    public void readFile() {
        try {
            File myObj = new File("AfsluttedeBestillinger.txt");
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
