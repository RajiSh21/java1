/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labsheet_1;

/**
 *
 * @author rajis
 */


abstract class Shape {
    abstract double area();
}
class Circle extends Shape {
    private final double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    double area() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    double area() {
        return side * side;
    }
}
public class QN_9 {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Square square = new Square(4);

        // Calculate and print the areas
        System.out.println("Area of circle: " + circle.area());
        System.out.println("Area of square: " + square.area());
    }
}

