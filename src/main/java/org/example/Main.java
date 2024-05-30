package org.example;

import org.example.arrays.BubbleSort;

public class Main {
    public static void main(String[] args) {

        int[] arr = {3,1,5,2,6,9,7,8,4};

        BubbleSort bubbleSort = new BubbleSort(arr);
        for (int num : bubbleSort.execute()) {
            System.out.print(num+", ");
        }
    }
}