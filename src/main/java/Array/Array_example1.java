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
public class Array_example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int [] array = new int[3];       // 0 1 2
       
       Scanner s = new Scanner(System.in);
       
       for (int i=0; i<3; i++) {
           System.out.println("Input next number: ");
           array[i] = s.nextInt();
       
       }
       
       int sum = 0;
       
       for (int i=0; i<3; i++) {
         sum += array[i];
       }
       
       double mediumValue = sum / 3.0;
       
        System.out.println("Medium value is: " + mediumValue);
    }
    
}
