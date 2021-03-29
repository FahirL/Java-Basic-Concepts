/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arithmetic;

import java.util.Scanner;

/**
 *
 * @author FahirL
 */
public class Arithmetic_3example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        // Function F(x, y)= x*y  / 1-x   +  3

        System.out.println("Input x i y value: ");
        double x = s.nextDouble();
        double y = s.nextDouble();
        double f = ((x * y) / (1 - x)) + 3;  // order  * - / +

        System.out.println("F(x,y)= " + f);

        /* order for calculation
           (i)
           * / + -
         */
    }

}
