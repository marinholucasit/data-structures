package org.example;

import org.example.arrays.BubbleSort;
import org.example.arrays.SelectionSort;

public class Main {
    public static void main(String[] args) {

        int[] arr = {10,1,5,2,6,9,7,8,4};

        BubbleSort bubbleSort = new BubbleSort(arr);
        System.out.println("Bubble");
        for (int num : bubbleSort.execute()) {
            System.out.print(num+" ");
        }
        System.out.println("");

        SelectionSort selectionSort = new SelectionSort(arr);
        System.out.println("selection");
        for (int num : selectionSort.execute()) {
            System.out.print(num+" ");
        }
    }
}