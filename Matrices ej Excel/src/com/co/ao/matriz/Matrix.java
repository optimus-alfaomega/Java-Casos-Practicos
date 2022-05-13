package com.co.ao.matriz;

import com.co.ao.metadata.Aometadata;

public class Matrix<T> extends Aometadata<Matrix> implements IMatrix {

    private final int TOTAL_CHARACTERS = 26;
    private final int MAX_PAIR_ALTERNATIVES = TOTAL_CHARACTERS * TOTAL_CHARACTERS;
    private final int MAX_SUCESSIONS = 5;
    private final int MAX_MEMORY = (MAX_PAIR_ALTERNATIVES * MAX_SUCESSIONS) + TOTAL_CHARACTERS;
    private Irow<T> rows[][];
    private String[] claves;

    public Matrix() {

        this.rows = new Row[MAX_MEMORY][MAX_MEMORY];
        claves = new String[MAX_MEMORY * MAX_MEMORY];
        init();

    }

    public void init() {

        final int size_Memory = this.MAX_MEMORY;
        final int size_posibilities_sucession = this.MAX_SUCESSIONS;
        final int size_posiblities_pair_alternatives = this.MAX_PAIR_ALTERNATIVES;
        final int size_characters = this.TOTAL_CHARACTERS;
        int contadorPosiblidades = 0;
        int contadorPalabras = 0;

        String[] caracteres = new String[size_characters];
        String[][] posibilidades = new String[size_posibilities_sucession][size_posiblities_pair_alternatives];
        String[] listaPalabras = new String[size_Memory];

        //// init de caracteres
        caracteres = new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
                "P",
                "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

        String caracteres2[] = caracteres;
        //////////////////////
        /// init posibilidades

        for (String caracter : caracteres2) {
            for (int primero = 0; primero < size_characters; primero++) {
                posibilidades[0][contadorPosiblidades++] = caracter + caracteres[primero];
            }
        }
        /////////////////////// init de posibilidades
        for (int fila_posibilidades = 0; fila_posibilidades < size_posibilities_sucession - 1; fila_posibilidades++) {
            for (int columna_posibilidades = 0; columna_posibilidades < size_posiblities_pair_alternatives; columna_posibilidades++) {
                for (int fila_caract = 0; fila_caract < size_characters; fila_caract++) {
                    int fila_posterior_posibilidades = fila_posibilidades + 1;
                    int actual_columna_posibilidades = columna_posibilidades;
                    int actual_fila_posibilidades = fila_posibilidades;
                    int actual_fila_caracteres = fila_caract;

                    posibilidades[fila_posterior_posibilidades][actual_columna_posibilidades] = caracteres[actual_fila_caracteres]
                            + posibilidades[actual_fila_posibilidades][actual_columna_posibilidades];

                }
            }
        }
        //////////////////////////////////////// 77
        ////// transformación de posibilidades de matriz a array
        for (int fila_letras = 0; fila_letras < caracteres.length; fila_letras++) {
            listaPalabras[contadorPalabras] = caracteres[fila_letras];
            contadorPalabras++;

        }

        for (int fila_posibilidades = 0; fila_posibilidades < size_posibilities_sucession; fila_posibilidades++) {
            for (int columna_posibilidades = 0; columna_posibilidades < size_posiblities_pair_alternatives; columna_posibilidades++) {

                listaPalabras[contadorPalabras] = posibilidades[fila_posibilidades][columna_posibilidades];

                contadorPalabras++;
            }
        }

        ////////////////////////////////////////
        /////// init de claves para enlistar datos de matriz
        int filas = 0;

        for (int index = 0; index < size_Memory; index++) {
            for (int contador = 0; contador < size_Memory; contador++) {

                this.claves[filas] = listaPalabras[index] + filas;
                filas++;
            }
        }
        ///////////////////////////////////////// 7
        ///// init de la matriz rows
        for (int fila_actual_row = 0; fila_actual_row < MAX_MEMORY; fila_actual_row++)
            for (int columna_actual_row = 0; columna_actual_row < MAX_MEMORY; columna_actual_row++) {
                rows[fila_actual_row][columna_actual_row] = new Row<T>();
            }

        for (int fila_row = 0, contadorRows = 1; fila_row < size_Memory; fila_row++, contadorRows++) {

            for (int col_row = 0; col_row < size_Memory; col_row++) {

                int valRow = contadorRows;
                this.rows[fila_row][col_row].setColumn(listaPalabras[col_row]);
                this.rows[fila_row][col_row].setRow(valRow);

            }
        }

        ///////////////// fin de init////////////////////
        // System.out.println(this.rows[100][0].getColumn() + " " +
        // this.rows[100][0].getRow());
        // this.impresion(this.rows[0][0].getColumn());
        // this.impresion(this.rows[3404][3405].getColumn());

    }

    @Override
    public int columnSize() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int columnCount() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int rowSize() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int rowsCount() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int diagonalCount() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean addValue(Object valor, int column, int row) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean deleteValue(int column, int row) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean findByColumn(Object valor, int column) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean findByRow(Object valor, int row) {
        // TODO Auto-generated method stub
        return false;
    }

    /**************************************************** */

    public void impresion(String Matrix[][]) {

        System.out.print("[");
        for (int indexX = 0; indexX < Matrix.length; indexX++) {
            System.out.print("{");

            for (int indexY = 0; indexY < Matrix[0].length; indexY++) {
                System.out.print(Matrix[indexX][indexY]);
                if (indexY < Matrix[0].length - 1) {
                    System.out.print(",");
                }
            }
            System.out.print("}");

        }

        System.out.println("]");

    }

    public void impresion(String Matrix[]) {
        System.out.print("{");

        for (String value : Matrix) {
            System.out.print(" " + value + " ");
        }
        System.out.println("}");

    }

    public void impresion(String value) {
        System.out.println(value);
    }

    public long factorialUsingForLoop(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

}
