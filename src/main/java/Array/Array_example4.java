/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;

/**
 *
 * @author FahirL
 */
public class Array_example4 {

    public enum Order {
        GROWING, DECLINING
    }

    public static void sortArray(double[] array, Order o) {

        for (int a = 0; a < array.length - 1; a++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (o == Order.GROWING) {
                    if (array[i] > array[i + 1]) {
                        double temporary = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temporary;
                    }
                } else if (o == Order.DECLINING) {
                    if (array[i] < array[i + 1]) {
                        double temporary = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temporary;
                    }
                }

            }

        }

    }

    public static void main(String[] args) {
        double[] array = {3.6, 7.8, 1.5};

        System.out.println("Array is was: " + Arrays.toString(array));

        sortArray(array, Order.DECLINING);

        System.out.println("Array is now: " + Arrays.toString(array));
    }

}
