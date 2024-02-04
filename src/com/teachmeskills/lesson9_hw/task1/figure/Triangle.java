package com.teachmeskills.lesson9_hw.task1.figure;

public final class Triangle extends BaseFigure {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        if (isTriangleExist(sideA, sideB, sideC)) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else {
            throw new IllegalArgumentException(String.format("Triangle with with sides '%f' & '%f' & '%f' does not exist!", sideA, sideB, sideC));
        }
    }

    @Override
    public double getPerimeter() {
        perimeter = sideA + sideB + sideC;
        System.out.printf("Perimeter of triangle with sides '%f' & '%f' & '%f' is: '%f'", sideA, sideB, sideC, perimeter);
        System.out.println();
        return perimeter;
    }

    @Override
    public double getSquare() {
        double halfPerimeter = (sideA + sideB + sideC) / 2;
        square = Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
        System.out.printf("Square of triangle with sides '%f' & '%f' & '%f' is: '%f'", sideA, sideB, sideC, square);
        System.out.println();
        return square;
    }

    private boolean isTriangleExist(double sideA, double sideB, double sideC) {
        return (sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA);
    }
}
