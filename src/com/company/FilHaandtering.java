package com.company;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;

public class FilHaandtering {
    public FilHaandtering() {
    }

    public static void writeToFile(String pathToFile, String data) throws IOException {
        FileWriter fileWriter = new FileWriter(pathToFile, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(data + "\n\n");
        bufferedWriter.close();
        fileWriter.close();
    }

   /* public static void filSkriver(String filNavn, String[] data) throws FileNotFoundException {
        File file = new File(filNavn);
        PrintStream ps = new PrintStream(new FileOutputStream(file, true));
        data = (String[])Arrays.stream(data).filter((orderSkriver) -> {
            return orderSkriver != null && orderSkriver.length() > 0;
        }).toArray((x$0) -> {
            return new String[x$0];
        });
        String checked = Arrays.toString(data);
        ps.println(checked);
        ps.close();
    }

    public void statistik() {
        Statistik s = new Statistik();
        s.readFile();
    }*/
}
