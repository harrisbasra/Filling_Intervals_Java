package com.mergedintervals.java;

import java.util.ArrayList;
import java.util.List;

public class Interval_Merger {

    public static List<int[]> mergeIntervals(List<int[]> intervals) {
        List<int[]> mergedIntervals = new ArrayList<>();

        if (intervals == null || intervals.isEmpty()) {
            return mergedIntervals;
        }

        int[] currentInterval = intervals.get(0);

        for (int i = 1; i < intervals.size(); i++) {
            int[] nextInterval = intervals.get(i);

            if (currentInterval[1] >= nextInterval[0]) {
                // Merge the overlapping intervals
                currentInterval[1] = Math.max(currentInterval[1], nextInterval[1]);
            } else {
                // Add the current merged interval and update currentInterval
                mergedIntervals.add(currentInterval);
                currentInterval = nextInterval;
            }
        }

        // Add the last merged interval
        mergedIntervals.add(currentInterval);

        return mergedIntervals;
    }
}
