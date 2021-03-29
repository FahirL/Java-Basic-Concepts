/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import java.util.Scanner;

/**
 *
 * @author FahirL
 */
public class Method {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input first number: ");
        int firstNumber = s.nextInt();
        System.out.println("Input second number: ");
        int secondNumber = s.nextInt();
        System.out.println("Input third number: ");
        int thirdNumber = s.nextInt();
        System.out.println("Input fourth number: ");
        int fourthNumber = s.nextInt();

        //    int smallerNumber = minimumTwoNumbers(firstNumber, secondNumber);  - for two numbers
        //     int smallerNumberTwoAndThree = minimumThreeNumbers(firstNumber, secondNumber, thirdNumber); -for three numbers
        int smallerNumberTwoThreeAndFour = minimumFourNumbers(firstNumber, secondNumber, thirdNumber, fourthNumber);

        System.out.println("Smaller number is: " + smallerNumberTwoThreeAndFour);
    }

    public static int minimumTwoNumbers(int a, int b) {

        if (a < b) {

            return a;

        } else {
            return b;
        }

    }

    public static int minimumThreeNumbers(int a, int b, int c) {

        return minimumTwoNumbers(minimumTwoNumbers(a, b), c);
    }

    public static int minimumFourNumbers(int a, int b, int c, int d) {

        return minimumTwoNumbers(minimumTwoNumbers(a, b), minimumTwoNumbers(c, d));
    }

}
