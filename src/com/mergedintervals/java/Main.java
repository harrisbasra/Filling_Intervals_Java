package com.mergedintervals.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<int[]> intervals = new ArrayList<>(Arrays.asList(
                new int[]{1, 2},
                new int[]{3, 6},
                new int[]{8, 10},
                new int[]{15, 18}
        ));

        Interval_Merger.mergeIntervals(intervals);

        for (int[] interval : intervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}

