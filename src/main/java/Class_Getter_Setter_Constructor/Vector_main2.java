/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_Getter_Setter_Constructor;

/**
 *
 * @author FahirL
 */
public class Vector_main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector_example[] array = new Vector_example[3];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = Vector_example.inputWithKeyboard();
        }

         Vector_example.sort(array, Vector_example.ORDER.RISING);
              for (int i=0; i<array.length; i++) {
                  System.out.println(array[i] + ", intensity = " + array[i].intensity());
              }
    }

}
