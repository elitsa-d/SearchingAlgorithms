package com.company;

// Time complexity: O(logn)
// Space complexity: O(1)

public class BinarySearch {
    public static int findIndexOf(int value, int[] array) {
        int beginIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex = (endIndex + beginIndex) / 2;

        while(array[middleIndex] != value) {
            if (endIndex > beginIndex) {
                if (array[middleIndex] > value) {
                    endIndex = middleIndex - 1;
                } else if (array[middleIndex] < value) {
                    beginIndex = middleIndex + 1;
                }

                middleIndex = (endIndex + beginIndex) / 2;
            } else {
                return -1;
            }
        }

        return middleIndex;
    }
}
