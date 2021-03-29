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
public class Arithmetic_1example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enrollment student year: ");

        int yearEnrollment = s.nextInt();
        int yearGraduation = yearEnrollment + 4;
        System.out.println("Year graduation: " + yearGraduation);
    }

}
