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
public class Vector_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector_example[] array = new Vector_example[3];
        
      /*  array[0] = new Vector_example(1.0, 2.0);
        array[1] = new Vector_example(1.5, 1.5);
        array[2] = new Vector_example(2.5, -0.5);
        array[3] = new Vector_example(-1.5, 2.6);
        array[4] = new Vector_example(0.0, 1.1); */
      
        for (int i=0; i<array.length; i++) {
             array[i] = Vector_example.inputWithKeyboard();
        }
        
        Vector_example result = new Vector_example();
        
        for(int i=0; i<array.length; i++) {
        result.sum(array[i]);
        }
        
        System.out.println("Result is " + result);
        
    }
    
}
