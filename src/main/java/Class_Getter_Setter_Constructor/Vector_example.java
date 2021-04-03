/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_Getter_Setter_Constructor;

import java.util.Scanner;

/**
 *
 * @author FahirL
 */
public class Vector_example {

    private double x, y;

    public double getX() { //getter
        return x;
    }

    public void setX(double x) { //setter
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) { //constructor
        this.y = y;
    }

    public Vector_example() { //constructor
        this.x = 0.0;
        this.y = 0.0;

    }

    public Vector_example(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void sum(Vector_example v) {  //saberi
        this.x += v.getX();
        this.y += v.getY();

    }

    public void subtract(Vector_example v) { //oduzmi
        this.x -= v.getX();
        this.y -= v.getY();

    }

    public void scaling(double scalar) {          //skaliranje
        this.x *= scalar;
        this.y *= scalar;

    }

    public double intensity() {
        return Math.sqrt(Math.pow(this.x, 2.0) + Math.pow(this.y, 2.0));

    }

    public Vector_example(Vector_example v) {
        this.x = v.getX();
        this.y = v.getY();
    }

    @Override
    public String toString() {
        return "Vector_example{" + "x=" + x + ", y=" + y + '}';
    }

    public static Vector_example inputWithKeyboard() {
        Scanner s = new Scanner(System.in);
        System.out.println("Input components vectors x and y (separated by a space): ");

        Vector_example v = new Vector_example();
        v.setX(s.nextDouble());
        v.setY(s.nextDouble());

        return v;
    }

    public static void change(Vector_example a, Vector_example b) {

        double temporaryX = a.getX();
        a.setX(b.getX());
        b.setX(temporaryX);

        double temporarayY = a.getY();
        a.setX(b.getY());
        a.setY(temporaryX);

    }
    public enum ORDER {DECLINING, RISING};
            
            
    public static void sort(Vector_example[] array, ORDER order) {
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (order == ORDER.RISING) {
                    if (array[i].intensity() > array[i + 1].intensity()) {
                        /*     Vector_example temporary = new Vector_example(array[i]);
                    array[i] = new Vector_example(array[i + 1]);
                    array[i + 1] = temporary; */
                        Vector_example.change(array[i], array[i + 1]);
                    } else if (order == ORDER.DECLINING) {
                        if (array[i].intensity() < array[i + 1].intensity()) {
                            Vector_example.change(array[i], array[i + 1]);

                        }
                    }
                }
            }
        }
    }
}
