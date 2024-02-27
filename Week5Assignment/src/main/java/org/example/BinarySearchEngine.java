package org.example;

public class BinarySearchEngine {
    public BinarySearchEngine() {
    }

    int binarySearch(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while(l < r) {
            int m = 1 + (r - 1)/2;
            if(arr[m] == x) {
                return m;
            }
            if(arr[m] < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

}
