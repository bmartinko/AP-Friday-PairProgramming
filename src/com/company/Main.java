package com.company;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sf = new Scanner(new File("/Users/bb222/IdeaProjects/AP-Friday-PairProgramming/src/com/company/scores2.txt"));
        String txt[] = new String[2000];

        int line = 0;
        int maxIndx = -1;

        while (sf.hasNext()) {
            maxIndx++;
            txt[maxIndx] = sf.nextLine();
        }
        sf.close();
        System.out.println(txt[2]);

        double[] averages = new double[line];
        line = 0;

        String stuff [] = new String [txt.length];
        String x = "";

        for(int i = 0; i < txt.length;i++){
            x = txt[i];
            stuff [i] = x.split("\t");
        }

        while (line < txt.length) {
            for (int j = 0; j <= 20; j++) {
                //19/20/21 averages

            }
        }
    }
}
