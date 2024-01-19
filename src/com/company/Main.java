package com.company;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {4, 6, 10, 4, 8, 2, 9, 3, 33};
        System.out.println(LinearSearch.findIndexOf(3, array1));

        int[] array2 = {1, 2, 5, 7, 13, 16, 20, 25, 34};
        System.out.println(BinarySearch.findIndexOf(5, array2));
    }
}
