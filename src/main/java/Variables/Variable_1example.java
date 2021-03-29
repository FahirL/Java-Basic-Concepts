package Variables;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FahirL
 * VARIABLES
 */
public class Variable_1example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int yearBirthStudent;  //create memory
        int yearBirthProfesor;

        yearBirthStudent = 1988;  //set value
        yearBirthProfesor = 1981;

        int ageDifference = yearBirthStudent - yearBirthProfesor;

        String message = "The age difference is " + ageDifference + ".";
        System.out.println(message);

    }

}
