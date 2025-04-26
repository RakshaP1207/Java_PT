/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java57;

import java.util.Scanner;

public class SegregateZerosOnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter the numbers (only 0s and 1s):");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int left = 0, right = size - 1;
        while (left < right) {
            while (numbers[left] == 0 && left < right) {
                left++;
            }
            while (numbers[right] == 1 && left < right) {
                right--;
            }
            if (left < right) {
                numbers[left] = 0;
                numbers[right] = 1;
                left++;
                right--;
            }
        }

        System.out.println("Segregated array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

