package main;

import chart.BarChart;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        BarChart barChart = new BarChart("Task types report",new ArrayList());

        BarChart barChart1 = new BarChart.BarChartBuilder("Title", null)
                .withBackgroundColor("black")
                .withFontSize(12)
                .build();

    }
}
