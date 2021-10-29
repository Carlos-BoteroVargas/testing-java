package Triangles;

public class Main {

    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);

        double triangleAArea = triangleA.findArea();
        System.out.println("The area of Triangle A is: " + triangleAArea);

        double triangleBArea = triangleB.findArea();
        System.out.println("The area of Triangle B is: " + triangleBArea);
        System.out.println("-----------------");

        System.out.println("This is Triangle A's sideLenThree: " + triangleA.sideLenThree);
        System.out.println("This is Triangle B's base: " + triangleB.base);
        System.out.println("-----------------");

        System.out.println("Regardless of the instance, we get " + Triangle.numOfSides + " sides per triangle!");
    }
}
