package org.example;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinarySearchEngine engine = new BinarySearchEngine();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++) {
            array[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        System.out.println(engine.binarySearch(array, x));
    }
}