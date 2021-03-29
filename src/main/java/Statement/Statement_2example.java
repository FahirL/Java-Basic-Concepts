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
public class Statement_2example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Input birth year: ");
        int yearBirth = s.nextInt();
        if (yearBirth <= 2000 && yearBirth % 2 == 0) {
            System.out.println("You were born before 2000. year, and year birth was even. ");
        } else {

            if (yearBirth <= 2000) {
                System.out.println("You were born before 2000. year.");
            } else {
                System.out.println("You were born after 2000. year.");
            }

            if (yearBirth % 2 == 0) {
                System.out.println("You were born in year which was even.");
            } else {
                System.out.println("You were born in year which was not even.");
            }
        }
        System.out.println("End.");
    }
}
