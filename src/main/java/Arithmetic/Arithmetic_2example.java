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
public class Arithmetic_2example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Input tempereture  in *C: ");

        double tempC = s.nextDouble();
        double tempF = tempC * 1.8 + 32;

        System.out.println("Tempereture in *F is " + tempF);
    }

}
