/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java57;

import java.util.Scanner;

public class MaxElementIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int maxIndex = 0;
        for (int i = 1; i < size; i++) {
            if (numbers[i] > numbers[maxIndex]) {
                maxIndex = i;
            }
        }

        System.out.println("The index of the maximum element is: " + maxIndex);

        scanner.close();
    }
}

