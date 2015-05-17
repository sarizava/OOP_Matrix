package com.epam.source;

/**
 * Created by Ruzhkov Nikolay on 16.05.2015.
 */
public class MatrixFactory{
    public int[][] FillMatrixRandom(int[][] matrixX, int ColCount, int RowCount){
        for (int i = 0; i < ColCount; i++) {
            for (int j = 0; j < RowCount; j++) {
                matrixX[i][j] = (int) (Math.random() * 9);
            }
        }
        return matrixX;
    }
}
