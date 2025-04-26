/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java57;

import java.util.Scanner;

public class MinElementIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int minIndex = 0;
        for (int i = 1; i < size; i++) {
            if (numbers[i] < numbers[minIndex]) {
                minIndex = i;
            }
        }

        System.out.println("The index of the minimum element is: " + minIndex);

        scanner.close();
    }
}

