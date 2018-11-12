package com.company;
import java.util.*;
import java.io.*;

public class Main {
    public static boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) throws IOException, NullPointerException {
        Scanner sf = new Scanner(new File("scores2.txt"));
        List<Integer> scores = new ArrayList<>();
        List<String> Schools = new ArrayList<>();
        int math;
        int reading;
        int writing;
        int averages;

        int skippedSchools = 0;

        sf.nextLine();
        while (sf.hasNextLine()) {
            String SATScore = sf.nextLine();

            String[] temp = SATScore.split("\\t");

            Schools.add(temp[1]);

            if (temp.length > 19) {

                if (tryParseInt(temp[18]) && tryParseInt(temp[19]) && tryParseInt(temp[20])){
                    math = Integer.parseInt(temp[18]);
                    reading = Integer.parseInt(temp[19]);
                    writing = Integer.parseInt(temp[20]);
                    averages = math + reading + writing;

                    scores.add(averages);}
                else
                    skippedSchools++;
            }
        }

        System.out.println("Average SAT Scores:");
        for (int i = 0; i < scores.size(); i++)
        {
            System.out.println(Schools.get(i) + ": " + scores.get(i));
        }

        int top1 = 0, top2 = 0, top3 = 0;
        int top1index = 0, top2index = 0, top3index = 0;
        for (int i = 0; i < scores.size(); i++)
        {
            int a = scores.get(i);
            if (a > top1)
            {
                top3 = top2;
                top2 = top1;
                top1 = a;
                top1index = i;
            }
            else if (a > top2)
            {
                top3 = top2;
                top2 = a;
                top2index = i;
            }
            else if (a > top3)
            {
                top3 = a;
                top3index = i;
            }
        }

        System.out.println(); // Spacing this text from the last to mak it looks nicer
        System.out.println("Top three schools:");
        System.out.println("#1 - " + Schools.get(top1index) + ": " + scores.get(top1index));
        System.out.println("#2 - " + Schools.get(top2index) + ": " + scores.get(top2index));
        System.out.println("#3 - " + Schools.get(top3index) + ": " + scores.get(top3index));

        int total = 0;
        for (int i : scores)
        {
            total += i;
        }
        System.out.println();
        System.out.println("State average: " + total / (scores.size() - skippedSchools));

    }
}