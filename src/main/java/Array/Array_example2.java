/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/**
 *
 * @author FahirL
 */
public class Array_example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("How much you input elements? ");
        int n = s.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Input next number: ");
            array[i] = s.nextInt();

        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double mediumValue = 1.0 * sum / array.length;

        System.out.println("Medium value is: " + mediumValue);
    }

}
