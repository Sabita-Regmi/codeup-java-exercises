package Shapes;
import java.util.Scanner;
import util.Input;


public class CircleApp {
    public static void main(String[] args) {

        Input test=new Input();
        Circle firstCircle=new Circle(test.getInt());
        System.out.println("The area of circle is "+firstCircle.getArea());
        System.out.println("The circumference of circle is " + firstCircle.getCircumference());

//        Circle circle1 = new Circle(5);
//        System.out.println("Radius is: " + circle1.getRadius());
//        System.out.println("Area is: " + circle1.getArea(4));
//        System.out.println("Circumference is: " + circle1.getCircumference(4));
//        Circle circle2 = new Circle(5);
//
//

    }

    }

