package com.teachmeskills.lesson9_hw.task1.figure;

public final class Circle extends BaseFigure {

    double radius;

    public Circle(double radius) {
        if (isCircleExist(radius)) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException(String.format("Circle with with radius '%f' does not exist!", radius));
        }
    }

    @Override
    public double getPerimeter() {
        perimeter = 2 * 3.14 * radius;
        System.out.printf("Perimeter of circle with radius '%f' is: '%f'", radius, perimeter);
        System.out.println();
        return perimeter;
    }

    @Override
    public double getSquare() {
        square = 3.14 * Math.pow(radius, 2);
        System.out.printf("Square of circle with radius '%f' is: '%f'", radius, square);
        System.out.println();
        return square;
    }

    private boolean isCircleExist(double radius) {
        return radius > 0;
    }
}
