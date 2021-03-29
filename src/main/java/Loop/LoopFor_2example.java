package Loop;

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
public class LoopFor_2example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.println("Input number: ");
            int number = s.nextInt();

            if (number % 2 == 0) {
                System.out.println("You have entered an even number.");
            } else {
                System.out.println("You have entered not an even number.");
            }
            System.out.println("End loop!");
            System.out.println("End.");
        }

    }
}
