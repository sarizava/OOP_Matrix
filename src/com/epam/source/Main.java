package com.epam.source;


/**
 * Created by GoodZone on 16.05.2015.
 */
public class Main {
    public static void main(String[] args) {
        int ColCount = 4;
        int RowCount = 4;
        MatrixFactory MatrixFill = new MatrixFactory();
        Matrix matrixA = new Matrix(ColCount, RowCount);
        matrixA.Values = MatrixFill.FillMatrixRandom(matrixA.Values,ColCount,RowCount);
        matrixA.show();
        Matrix matrixB = new Matrix(ColCount, RowCount);
        matrixB.Values = MatrixFill.FillMatrixRandom(matrixB.Values,ColCount,RowCount);
        matrixB.show();
        Matrix matrixC = new Matrix(ColCount, RowCount);
        for (int i = 0; i < matrixA.Values.length; i++) {
            for (int j = 0; j < matrixB.Values[0].length; j++) {
                for (int k = 0; k < matrixC.Values[0].length; k++) {
                    matrixC.Values[i][j] += matrixA.Values[i][k] * matrixB.Values[k][j];
                }
            }
        }
        System.out.println("Matrix multiplication: ");
        matrixC.show();
    }
}
