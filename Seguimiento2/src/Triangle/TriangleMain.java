package Triangle;

import java.util.Scanner;

public class TriangleMain {
    public static void main(String[] args) {
        Triangle angle = new Triangle(120,40,20);


        if (angle.isValidTriangle()) {
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is not valid.");
        }
    }
}
