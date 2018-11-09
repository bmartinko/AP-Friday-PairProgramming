package com.company;

/**
 * Created by bb222 on 11/9/18.
 */
public class Read {
    public double averages;

    public int numSchoolsSAT;
    public Read (String a) {
        String[] info = a.split("\\t");
        if (info.length==24) {
            this.averages = (Double.parseDouble(info[info.length - 1]) +
                    (Double.parseDouble(info[info.length - 2]) +
                            (Double.parseDouble(info[info.length - 3]))));
            numSchoolsSAT++;
        }

    }
    public double getTotalAverage(){

        return numSchoolsSAT;
    }
    public double getAverages(){

        return averages;
    }
}
