package com.co.ao.matriz;

public interface IMatrix<T> {

    public int columnSize();

    public int columnCount();

    public int rowSize();

    public int rowsCount();

    public int diagonalCount();

    public boolean isEmpty();

    public boolean addValue(T valor, int column, int row);

    public boolean deleteValue(int column, int row);

    public boolean findByColumn(T valor, int column);

    public boolean findByRow(T valor, int row);

}
