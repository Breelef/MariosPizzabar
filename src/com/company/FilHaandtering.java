package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Arrays;


public class  FilHaandtering {


    public static void filSkriver(String filNavn, String[] data) throws FileNotFoundException {
        File file = new File(filNavn);
        PrintStream ps = new PrintStream(new FileOutputStream(file, true));

        data = Arrays.stream(data)
                .filter(orderSkriver -> (orderSkriver != null && orderSkriver.length() > 0))
                .toArray(String[]::new);
        String checked = Arrays.toString(data);
        ps.println(checked);

        ps.close();
    }
}
