package com.teachmeskills.lesson9_hw.task2.run;

import com.teachmeskills.lesson9_hw.task2.matrix.Matrix;

import static com.teachmeskills.lesson9_hw.task2.util.Utils.multiplyMatrix;
import static com.teachmeskills.lesson9_hw.task2.util.Utils.printMatrix;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Matrix #1: ");
        printMatrix(Matrix.getMatrix1());
        System.out.println("Matrix #2: ");
        printMatrix(Matrix.getMatrix2());
        System.out.println("Result of matrices multiplication: ");
        printMatrix(multiplyMatrix(Matrix.getMatrix1(), Matrix.getMatrix2()));
    }
}
