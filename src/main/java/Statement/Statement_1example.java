package Statement;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author FahirL
 */
public class Statement_1example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Input birth year: ");

        int yearBirth = s.nextInt();

        if (yearBirth % 2 == 0) {  // % ostatak pri djeljenju
            System.out.println("Year birth which you input is even.");
        } else {
            System.out.println("Year birth which you input is not even.");
        }
        System.out.println("End.");
    }
}
