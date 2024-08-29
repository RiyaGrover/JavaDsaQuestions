// Question : https://leetcode.com/problems/sort-an-array/description/

import java.util.Random;

class Solution {
    public int[] sortArray(int[] arr) {
        if (arr == null || arr.length == 0) return arr;
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    private void quickSort(int[] arr, int lo, int hi) {
        if (lo < hi) {
            if (hi - lo + 1 <= 10) {
                insertionSort(arr, lo, hi);
            } else {
                int mid = lo + (hi - lo) / 2;
                int median = medianOfThree(arr, lo, mid, hi);
                int pivotIndex = partition(arr, median, lo, hi);
                quickSort(arr, lo, pivotIndex - 1);
                quickSort(arr, pivotIndex + 1, hi);
            }
        }
    }

    private void insertionSort(int[] arr, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= lo && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    private int partition(int[] arr, int pivotIndex, int lo, int hi) {
        int pivot = arr[pivotIndex];
        // Place the pivot at the end
        int temp = arr[hi];
        arr[hi] = arr[pivotIndex];
        arr[pivotIndex] = temp;

        // Partitioning
        int i = lo;
        for (int j = lo; j < hi; j++) {
            if (arr[j] < pivot) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        // Move pivot to its correct position
        temp = arr[i];
        arr[i] = arr[hi];
        arr[hi] = temp;

        return i;
    }

    private int medianOfThree(int[] arr, int lo, int mid, int hi) {
        if (arr[lo] > arr[mid]) {
            if (arr[mid] > arr[hi]) {
                return mid;
            } else if (arr[lo] > arr[hi]) {
                return hi;
            } else {
                return lo;
            }
        } else {
            if (arr[lo] > arr[hi]) {
                return lo;
            } else if (arr[mid] > arr[hi]) {
                return hi;
            } else {
                return mid;
            }
        }
    }
}
