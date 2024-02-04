package com.teachmeskills.lesson9_hw.task1.figure;

public abstract sealed class BaseFigure implements ISquare permits Circle, Rectangle, Triangle {

    double perimeter;
    double square;

}
