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
public class Main_class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vector_example v1 = new Vector_example(4, 4);
        Vector_example v2 = new Vector_example(3, 3);

        Vector_example v3 = new Vector_example();
        v3.setX(v1.getX());
        v3.setY(v1.getY());

        v3.sum(v2);
        v3.scaling(2.0);
        v3.subtract(v1);

        /*  System.out.println("V1 is " + v1.getX() + " and " + v1.getY()); 
        System.out.println("V2 is " + v2.getX() + " and " + v2.getY());
        System.out.println("V3 is " + v3.getX() + " and " + v3.getY()); */
        System.out.println("V1 = " + v1);
        System.out.println("V2 = " + v2);
        System.out.println("V3 = " + v3);

        System.out.println("V3 intensity = " + v3.intensity());
    }

}
    //CONSOLE RESULT
   /* V1 = Vector_example{x=4.0, y=4.0}
      V2 = Vector_example{x=3.0, y=3.0}
      V3 = Vector_example{x=10.0, y=10.0}
      V3 intensity = 14.142135623730951
      -------------------------------  */

