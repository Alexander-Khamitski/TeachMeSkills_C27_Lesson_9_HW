package com.teachmeskills.lesson9_hw.task1.figure;

public final class Rectangle extends BaseFigure {

    double sideA;
    double sideB;

    public Rectangle(double sideA, double sideB) {
        if (isRectangleExist(sideA, sideB)) {
            this.sideA = sideA;
            this.sideB = sideB;
        } else {
            throw new IllegalArgumentException(String.format("Rectangle with with sides '%f' & '%f' does not exist!", sideA, sideB));
        }
    }

    @Override
    public double getPerimeter() {
        perimeter = 2 * (sideA + sideB);
        System.out.printf("Perimeter of rectangle with sides '%f' & '%f' is: '%f'", sideA, sideB, perimeter);
        System.out.println();
        return perimeter;
    }

    @Override
    public double getSquare() {
        square = sideA * sideB;
        System.out.printf("Square of rectangle with sides '%f' & '%f' is: '%f'", sideA, sideB, square);
        System.out.println();
        return square;
    }

    private boolean isRectangleExist(double sideA, double sideB) {
        return sideA >= 0 && sideB >= 0;
    }
}
