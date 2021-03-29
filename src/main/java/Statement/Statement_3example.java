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
public class Statement_3example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Input name city: ");
        String nameCity = s.nextLine();
        nameCity = nameCity.trim(); // remove space
        nameCity = nameCity.toUpperCase(); // convert to upper case

        if ("Beograd".equals(nameCity) || "Novi Sad".equals(nameCity)) {

            System.out.println("We have an organization in this city.");
        } else {
            System.out.println("Sorry, we dont have an organization in this city.");
        }
        System.out.println("End.");
    }
}
