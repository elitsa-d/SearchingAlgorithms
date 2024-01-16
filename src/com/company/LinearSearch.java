package com.company;

// Time complexity: O(n)
// Space complexity: O(1)

public class LinearSearch {
    public static int findIndexOf(int target, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
