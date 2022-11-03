package com.jordan.javaeasysteps;

public class Convert {
    public static void main(String[] args) {
        float daysFloat = 365.25f;
        String weeksOfString = "52";

        int daysint = (int) daysFloat;
        int weekint = Integer.parseInt( weeksOfString );

        int week = ( daysint / weekint );
        System.out.println("Days per week: " + week);
    }
}
