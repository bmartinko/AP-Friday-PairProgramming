package com.company;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, NullPointerException {
        Scanner sf = new Scanner(new File("scores2.txt"));
        String txt[] = new String[2000];

        int line = 0;
        int maxIndx = -1;

        while (sf.hasNext()) {
            maxIndx++;
            txt[maxIndx] = sf.nextLine();
        }

        Read[] ourDoc = new Read[maxIndx];

        for (int i = 1; i < ourDoc.length; i++){
            ourDoc[i] = new Read(txt[i]);
        }

        sf.close();

        double totalAverages = 0;
        for(int i = 1; i < ourDoc.length;i++){
            totalAverages += ourDoc[i].averages;

        }
        System.out.println(ourDoc[4].averages);
       // totalAverages = totalAverages / ourDoc[].getTotalAverage();
        System.out.println("The average SAT score in the city of New York is: " + totalAverages);
    }
}
