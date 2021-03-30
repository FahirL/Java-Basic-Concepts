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
public class Array_example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double[] array = new double[10];

        for (int i = 0; i < array.length; i++) {

            System.out.println("Input next number: ");
            array[i] = s.nextDouble();
        }
        double theSmallest = Double.MAX_VALUE;
        double theLargest = Double.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < theSmallest) {
                theSmallest = array[i];

            }
            if (array[i] > theLargest) {
                theLargest = array[i];

            }

        }
        System.out.println("The smallest value in array is: " + theSmallest);
        System.out.println("The largest value in array is: " + theLargest);

    }
}
