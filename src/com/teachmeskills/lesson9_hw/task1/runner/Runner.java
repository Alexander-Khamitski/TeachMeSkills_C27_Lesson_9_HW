package com.teachmeskills.lesson9_hw.task1.runner;

import com.teachmeskills.lesson9_hw.task1.figure.BaseFigure;
import com.teachmeskills.lesson9_hw.task1.figure.Circle;
import com.teachmeskills.lesson9_hw.task1.figure.Rectangle;
import com.teachmeskills.lesson9_hw.task1.figure.Triangle;

public class Runner {

    public static void main(String[] args) {
        BaseFigure triangle1 = new Triangle(3, 4, 5);
        BaseFigure triangle2 = new Triangle(3, 6, 5);
        BaseFigure rectangle = new Rectangle(4, 7);
        BaseFigure circle1 = new Circle(3);
        BaseFigure circle2 = new Circle(4);
        BaseFigure[] baseFigures = {triangle1, triangle2, rectangle, circle1, circle2};

        getFigureInfo(baseFigures);
        getSumOfAllPerimeters(baseFigures);
    }

    public static void getFigureInfo(BaseFigure[] baseFigures) {
        for (BaseFigure baseFigure : baseFigures) {
            baseFigure.getPerimeter();
            baseFigure.getSquare();
        }
        System.out.println("******");
    }

    public static void getSumOfAllPerimeters(BaseFigure[] baseFigures) {
        double sumOfAllPerimeters = 0;
        for (BaseFigure baseFigure : baseFigures) {
            sumOfAllPerimeters += baseFigure.getPerimeter();
        }
        System.out.printf("Sum of all figure perimeters is: '%f'", sumOfAllPerimeters);
    }

}
