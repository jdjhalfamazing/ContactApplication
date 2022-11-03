package com.jordan.javaeasysteps;

public class Escape {
    public static void main(String[] args) {
        String header = "\n\tNEW YORK 3-DAY FORECAST:\n";
        header += "\n\tDay\t\tHigh\tLow\tConditions\n";
        header += "\t---\t\t----\t----------\n";

        String forecast = "\tSunday\t\t68F\t48\tSunny\n";
        forecast += "\tMonday\t\t69F\t57\tSunny\n";
        forecast += "\tTuesday\t\t71F\t50\tCloudy\n";

        System.out.println(header + forecast);

    }
}
