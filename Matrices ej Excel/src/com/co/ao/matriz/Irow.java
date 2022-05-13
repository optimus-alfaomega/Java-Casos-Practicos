package com.co.ao.matriz;

public interface Irow<T> {

    public T getValue();

    public String getColumn();

    public int getRow();

    public void setColumn(final String column);

    public void setRow(final int row);

}
