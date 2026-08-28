package Sorting;

import java.util.Scanner;

public class Bubble_Sort {
    
    static Scanner sc = new Scanner(System.in);
    static int[] arr; // Declared here, instantiated dynamically later

    public static void createArray() {
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        arr = new int[size];
        
        System.out.println("Enter " + size + " Elements in Array:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void display() {
        if (arr == null) {
            System.out.println("Array is empty! Please insert elements first.");
            return;
        }
        System.out.println("Elements of array are:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void sort() {
        if (arr == null) {
            System.out.println("Array is empty! Please insert elements first.");
            return;
        }

        // Fixed inner loop to condition and increment on 'j' instead of 'i'
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Array sorted successfully!");
    }

    public static void main(String[] args) {
        int choice = 0;
        while (choice != 4) {
            System.out.printf("%nEnter Your Choice : %n1. Insert Elements%n2. Display Elements%n3. Sort Array%n4. Exit%n");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    createArray();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    sort();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Enter Valid Choice!");
                    break;
            }
        }
    }
}