package org.example.arrays;

public class SelectionSort {
    private int[] array;

    public SelectionSort(int[] array) {
        this.array = array;
    }

    public int[] execute() {
        int size = this.array.length;
        int min_index = 0;

        for (int i = 0; i < size -1; i++) {
            min_index = i;
            for (int j = i+1; j < size; j++) {
                if (this.array[j] < this.array[min_index]) {
                    min_index = j;
                }
            }
            int temp = this.array[i];
            this.array[i] = this.array[min_index];
            this.array[min_index] = temp;
        }
        return this.array;
    }
}
