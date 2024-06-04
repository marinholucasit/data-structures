package org.example.arrays;

public class BubbleSort {
    private int[] array;

    public BubbleSort(int[] array) {
        this.array = array;
    }

    public int[] execute() {
        int size = this.array.length;
        boolean swapped = false;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size -1 -i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;

                    swapped = true;
                }
            }
            if (!swapped) {
                return array;
            }
        }
        return array;
    }
}
