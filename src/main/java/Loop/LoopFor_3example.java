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
public class LoopFor_3example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

            int secretNumber = 55;
            for (int i = 0; i < 10; i++) {
                
            System.out.println("Input number: ");
            int number = s.nextInt();
            
            if (number == secretNumber) {
                System.out.println("You have entered success number.");
                break;
            } else {
                if ( secretNumber < number) {
                    System.out.println("Secret number is smaller.");
                } else {
                    System.out.println("Secret number is higher.");
                }
            }
    }
        System.out.println("End loop!");
        System.out.println("End.");
    }

}