public class Main {

    public static void main(String[] args) {

        SumaMatricez suma = new SumaMatricez();

        Integer values[] = new Integer[] { 1, 2, 3 };
        Integer Matrix[][] = new Integer[][] { { 1, 2 }, { 3, 3 } };
        Integer result[] = suma.suma(values, values);

        suma.impresion(result);
        result = suma.resta(values, values);
        suma.impresion(result);
        int escalar = suma.productoPunto(values, values);
        suma.impresion(values);
        suma.impresion(escalar);
        result = suma.productoEscalar(values, 3);
        suma.impresion(result);
        result = suma.combinacionSimple(values, values);
        suma.impresion(result);
        suma.impresion(values);
        result = suma.combinacionDiferente(values);
        suma.impresion(result);
        System.out.println("");
        suma.impresion(Matrix);
        Integer resultM[][] = suma.suma(Matrix, Matrix);
        suma.impresion(resultM);

    }

    /// test1 impresón abc
    /*
     * String caracteres[] = new String[] { "A", "B", "C", "D", "E", "F", "G", "H",
     * "I", "J", "K", "L", "M", "N", "O",
     * "P",
     * "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
     * for (int tercero = 0; tercero < caracteres.length; tercero++) {
     * String caracteres3[] = caracteres;
     * for (int segundo = 0; segundo < caracteres.length; segundo++) {
     * String caracteres2[] = caracteres;
     * for (int primero = caracteres.length - 1; primero > -1; primero--) {
     * System.out.print(caracteres[primero]);
     * }
     * System.out.println(caracteres2[segundo]);
     * }
     * System.out.println(caracteres3[tercero]);
     * }
     */

    // test2 recorrido de matrices con for estandar vs for each

    /*
     * Integer Result[] = new Integer[Matrix1.length];
     * for (Integer value2 : Matrix2) {
     * for (int primero=0;primero < Matrix1.length; primero ++)
     * Result[primero]=value2+Matrix1[primero];
     * 
     * }
     * return Result;
     */

}
