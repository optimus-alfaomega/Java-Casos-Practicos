package com.co.ao.matriz.mathOperation;

import com.co.ao.matriz.IMatrix;

public interface IMatrixStandarMathOperation<T> {

    public int additionColumn(IMatrix<T> matrix, int fromColumn, int toColumn);

    public int additionRow(IMatrix<T> matrix, int fromRow, int toRow);

    public int addition(T... args);

    public int restColumn(IMatrix<T> matrix, int fromColumn, int toColumn);

    public int restRow(IMatrix<T> matrix, int fromRow, int toRow);

    public int rest(T... args);

    public int multColumn(IMatrix<T> matrix, int fromColumn, int toColumn);

    public int multRow(IMatrix<T> matrix, int fromRow, int toRow);

    public int multiplication(T... args);

    public double division(T arg1, T arg2);

    public int averageColumn(IMatrix<T> matrix, int fromColumn, int toColumn);

    public int averageRow(IMatrix<T> matrix, int fromRow, int toRow);

    public int average(T... args);

    public int findMaxColumn(IMatrix<T> matrix, int fromColumn, int toColumn);

    public int findMaxRow(IMatrix<T> matrix, int fromRow, int toRow);

    public int findMax(T... args);

    public int findMinColumn(IMatrix<T> matrix, int fromColumn, int toColumn);

    public int findMinRow(IMatrix<T> matrix, int fromRow, int toRow);

    public int findMin(T... args);

}
