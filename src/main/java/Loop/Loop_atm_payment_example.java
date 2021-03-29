/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loop;

import java.util.Scanner;

/**
 *
 * @author FahirL
 */
public class Loop_atm_payment_example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Input the amount for payment:  ");
        int amount = s.nextInt();
        s.nextLine();

        int forPayment5000 = 0;
        int forPayment2000 = 0;
        int forPayment1000 = 0;
        int forPayment500 = 0;
        int forPayment200 = 0;
        int forPayment100 = 0;
        int forPayment50 = 0;
        int forPayment20 = 0;
        int forPayment10 = 0;
        int forPayment5 = 0;
        int forPayment2 = 0;
        int forPayment1 = 0;

        while (amount >= 5000) {
            forPayment5000++;
            amount -= 5000;

        }
        while (amount >= 2000) {
            forPayment2000++;
            amount -= 2000;

        }
        while (amount >= 1000) {
            forPayment1000++;
            amount -= 1000;

        }
        while (amount >= 500) {
            forPayment500++;
            amount -= 500;

        }
        while (amount >= 200) {
            forPayment200++;
            amount -= 200;

        }
        while (amount >= 100) {
            forPayment100++;
            amount -= 100;

        }
        while (amount >= 50) {
            forPayment50++;
            amount -= 50;

        }
        while (amount >= 20) {
            forPayment20++;
            amount -= 20;

        }
        while (amount >= 10) {
            forPayment10++;
            amount -= 10;

        }
        while (amount >= 5) {
            forPayment5++;
            amount -= 5;

        }
        while (amount >= 2) {
            forPayment2++;
            amount -= 2;

        }
        while (amount >= 1) {
            forPayment1++;
            amount -= 1;

        }
        if (forPayment5000 > 0) {
            System.out.println("Pay " + forPayment5000 + " banknotes from 5000.");

        }
        if (forPayment2000 > 0) {
            System.out.println("Pay " + forPayment2000 + " banknotes from 2000.");

        }
        if (forPayment1000 > 0) {
            System.out.println("Pay " + forPayment1000 + " banknotes from 1000.");

        }
        if (forPayment500 > 0) {
            System.out.println("Pay " + forPayment500 + " banknotes from 500.");

        }
        if (forPayment200 > 0) {
            System.out.println("Pay " + forPayment200 + " banknotes from 200.");

        }
        if (forPayment100 > 0) {
            System.out.println("Pay " + forPayment100 + " banknotes from 100.");

        }
        if (forPayment50 > 0) {
            System.out.println("Pay " + forPayment50 + " banknotes from 50.");

        }
        if (forPayment20 > 0) {
            System.out.println("Pay " + forPayment20 + " banknotes from 20.");

        }
        if (forPayment10 > 0) {
            System.out.println("Pay " + forPayment10 + " banknotes from 10.");

        }
        if (forPayment5 > 0) {
            System.out.println("Pay " + forPayment5 + " banknotes from 5.");

        }
        if (forPayment2 > 0) {
            System.out.println("Pay " + forPayment2 + " banknotes from 2.");

        }
        if (forPayment1 > 0) {
            System.out.println("Pay " + forPayment1 + " banknotes from 1.");

        }

    }

}
