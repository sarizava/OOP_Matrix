package com.epam.source;

/**
 * Created by GoodZone on 16.05.2015.
 */
public class Matrix {
    protected int[ ][ ] Values;
    private int ColCount;
    private int RowCount;
    public Matrix(int ColCount, int RowCount) {
        this.ColCount = ColCount;
        this.RowCount = RowCount;
        Values = new int[ColCount][RowCount];
    }
    public void show() {
        System.out.println("Matrix: " + Values.length + " X " + Values[0].length+":");
        for (int i = 0; i < Values.length; i++) {
            for (int j = 0; j < Values[0].length; j++) {
                System.out.print(Values[i][j] + " ");
            }
            System.out.println();
        }
    }
}
