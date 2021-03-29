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
/* BG-123-AB / 9 za duzinu stringa 
(01 78) slova A-Z, ŠĆĆŽ 
(2 6) -
(345) cifre 0-9 */
public class Method_2example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Input register tag: ");
        String regTag = s.nextLine();

        boolean tableIsOk = correctRegisterTable(regTag);

        if (tableIsOk) {
            System.out.println("Table is ok!");
        } else {
            System.out.println("Table is wrong!");
        }
    }

    public static boolean correctRegisterTable(String table) {

        if (table.length() != 9) {  //ako tablica nema duzinu od 9
            return false;
        }
        if (!whetherLetterIsAllowed(table.charAt(0)) || !whetherLetterIsAllowed(table.charAt(1)) || !whetherLetterIsAllowed(table.charAt(7)) || !whetherLetterIsAllowed(table.charAt(8))) { //ako nije jednako slovu, vrati FALSE
            return false;
        }
        if (!Character.isDigit(table.charAt(3)) || !Character.isDigit(table.charAt(4)) || !Character.isDigit(table.charAt(5))) {
            return false;
        }

        if (table.charAt(2) != '-' || table.charAt(6) != '-') {
            return false;
        }

        return true;

    }

    public static boolean whetherLetterIsAllowed(char character) {

        if (character == 'A' || character == 'B' || character == 'C' || character == 'D' || character == 'E' || character == 'F' || character == 'G' || character == 'H'
            || character == 'I' || character == 'J' || character == 'K' || character == 'L' || character == 'M' || character == 'N' || character == 'O' || character == 'P'
            || character == 'R' || character == 'S' || character == 'T' || character == 'U' || character == 'Q' || character == 'V' || character == 'W' || character == 'X'
            || character == 'Y' || character == 'Z' || character == 'Š' || character == 'Đ' || character == 'Č' || character == 'Ć' || character == 'Ž') {
            return true;

        } else {
            return false;
        }

    }

}
