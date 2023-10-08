package com.mergedintervals.java;

import java.util.ArrayList;
import java.util.List;

public class Interval_Merger {
    public static void mergeIntervals(List<int[]> intervals) {
        if (intervals == null || intervals.size() <= 1) {
            return;
        }

        int i = 0;
        while (i < intervals.size() - 1) {
            int[] currentInterval = intervals.get(i);
            int[] nextInterval = intervals.get(i + 1);

            if (currentInterval[1] >= nextInterval[0]) {
                // Merge the overlapping intervals
                currentInterval[1] = Math.max(currentInterval[1], nextInterval[1]);
                // Remove the next interval
                intervals.remove(i + 1);
            } else {
                i++;
            }
        }
    }

}
