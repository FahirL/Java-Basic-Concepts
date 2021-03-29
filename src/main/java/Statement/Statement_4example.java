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
public class Statement_4example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Input real number: ");
        double number = s.nextDouble();
        double rootOffNumber = Math.sqrt(number);

        if (rootOffNumber == 5.0) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }
        System.out.println("End.");
    }
}
