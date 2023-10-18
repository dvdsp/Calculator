/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import Model.Circle;
import Model.Rectangle;
import Model.Triangle;

/**
 *
 * @author DELL
 */
public class Library {
    public static Triangle inputTriangle() {
        while (true) {
            System.out.print("Please input side A of Triangle: ");
            double a = Validate.checkInputDouble();
            System.out.print("Please input side B of Triangle: ");
            double b = Validate.checkInputDouble();
            System.out.print("Please input side C of Triangle: ");
            double c = Validate.checkInputDouble();
            if (a + b > c && b + c > a && a + c > b) {
                return new Triangle(a, b, c);
            } else {
                System.out.println("Invalid. Let's enter again:     ");
            }
        }

    }

    public static Rectangle inputRectangle() {
        System.out.print("Please input side width of Rectangle: ");
        double width = Validate.checkInputDouble();
        System.out.print("Please input length of Rectangle: ");
        double length = Validate.checkInputDouble();
        return new Rectangle(width, length);
    }

    public static Circle inputCircle() {
        System.out.print("Please input radius of Circle: ");
        double radius = Validate.checkInputDouble();
        return new Circle(radius);
    }

    public static void display(Triangle trigle, Rectangle rectangle, Circle circle) {
        System.out.println("*RECTANGLE");
        rectangle.printResult();
        System.out.println("*CIRCLE");
        circle.printResult();
        System.out.println("*TRIANGLE");
        trigle.printResult();
    }
}
