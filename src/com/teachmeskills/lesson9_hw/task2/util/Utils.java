package com.teachmeskills.lesson9_hw.task2.util;

public class Utils {

    public static void printMatrix(int[][] matrix) {
        for (int[] rows : matrix) {
            for (int element : rows) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            throw new IllegalArgumentException(String.format(
                    "Matrix multiplication is not possible because the number of columns in the first matrix '%d' does not match the number of rows '%d' in the second matrix",
                    matrix1[0].length, matrix2.length));
        }
        int rows1 = matrix1.length;
        int columns1 = matrix1[0].length;
        int columns2 = matrix2[0].length;
        int[][] resultMatrix = new int[rows1][columns2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return resultMatrix;
    }
}
