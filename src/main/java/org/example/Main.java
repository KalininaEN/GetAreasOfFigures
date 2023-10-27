package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("getSquareArea(6) = " + getSquareArea(6));
        System.out.println("getCircleArea(6) = " + getCircleArea(6));
        System.out.println("getTriangleArea(4,6,5) = " + getTriangleArea(4, 6, 5));
    }

    public static int getSquareArea(int side) {
        return side * side;
    }

    public static double getCircleArea(int radius) {
        return Math.PI * radius * radius;
    }

    public static double getTriangleArea(int side1, int side2, int side3) {
        double semiPerimeter = (double) (side1 + side2 + side3) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter * side2) * (semiPerimeter * side3));
    }
}