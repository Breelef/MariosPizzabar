package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Statistik {
   public void readFile() {
       try {
           File myObj = new File("PizzaDerErBlevetBestilt.txt");
           Scanner myReader = new Scanner(myObj);
           while (myReader.hasNextLine()) {
               String data = myReader.nextLine();
               System.out.println(data);
           }
           myReader.close();
       } catch (
               FileNotFoundException e) {
           System.out.println("An error occurred.");
           e.printStackTrace();
       }
   }
}

