/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labsheet_1;

/**
 *
 * @author rajis
 */
class Figure {
    public double area() {
        return 0;
    }
}

class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

class Triangle extends Figure {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

public class QN_8 {
    public static void main(String[] args) {
        Figure[] figures = new Figure[2];
        figures[0] = new Rectangle(5, 4);
        figures[1] = new Triangle(6, 3);

        for (Figure figure : figures) {
            System.out.println("Area of figure: " + figure.area());
        }
    }
}