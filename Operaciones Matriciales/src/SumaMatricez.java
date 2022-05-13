public class SumaMatricez {

    public Integer[] suma(Integer Matrix1[], Integer Matrix2[]) {
        Integer Result[] = new Integer[Matrix1.length];
        for (int primero = 0; primero < Matrix1.length; primero++) {
            Result[primero] = Matrix1[primero] + Matrix2[primero];
        }
        return Result;
    }

    public Integer[][] suma(Integer Matrix1[][], Integer Matrix2[][]) {
        Integer Result[][] = null;
        if (this.isSquare(Matrix1) && this.isSquare(Matrix2)) {
            if (this.isEqualSize(Matrix1, Matrix2)) {
                Result = new Integer[Matrix1.length][Matrix2.length];
                Integer resultSize = Matrix1.length;
                for (int primero = 0; primero < resultSize; primero++) {
                    Integer array1[] = Matrix1[primero];
                    Integer array2[] = Matrix2[primero];
                    Result[primero] = this.suma(array1, array2);
                }
            }
        }
        return Result;

    }

    public Integer[] resta(Integer Matrix1[], Integer Matrix2[]) {
        Integer Result[] = new Integer[Matrix1.length];
        for (int primero = 0; primero < Matrix1.length; primero++) {
            Result[primero] = Matrix1[primero] - Matrix2[primero];
        }
        return Result;
    }

    // producto punto, es multiplicar dos matrices y obtener un escalar
    public Integer productoPunto(Integer Matrix1[], Integer Matrix2[]) {
        Integer Result = 0;
        for (int primero = 0; primero < Matrix1.length; primero++) {
            Result = Matrix1[primero] * Matrix2[primero] + Result;
        }

        return Result;
    }

    public Integer[] productoEscalar(Integer Matrix1[], Integer value) {
        Integer Result[] = new Integer[Matrix1.length];

        for (int primero = 0; primero < Matrix1.length; primero++) {
            Result[primero] = Matrix1[primero] * value;
        }

        return Result;

    }

    public Integer[] combinacionSimple(Integer Matrix1[], Integer Matrix2[]) {
        Integer Result[] = new Integer[Matrix1.length * Matrix2.length];
        Integer contador = 0;

        for (Integer value : Matrix2)
            for (int primero = 0; primero < Matrix1.length; primero++) {
                Result[contador++] = Matrix1[primero] + value;
            }

        return Result;
    }

    public Integer[] combinacionDiferente(Integer Matrix1[]) {
        Long factorial = this.factorialUsingForLoop(Matrix1.length);
        Integer size = factorial.intValue();
        Integer Result[] = new Integer[size];
        Integer contador = 0;
        Integer Matrix2[] = Matrix1;

        for (Integer value : Matrix2)
            for (int primero = 0; primero < Matrix1.length; primero++) {
                if (!value.equals(Matrix1[primero])) {
                    Result[contador++] = Matrix1[primero] + value;
                }
            }

        return Result;
    }

    public boolean isSquare(Integer Matrix[][]) {

        int sizeX = Matrix.length;
        boolean response = true;
        for (int index = 0; index < sizeX; index++) {
            if (Matrix[index].length != sizeX) {
                response = false;
                break;
            }
        }

        return response;

    }

    public boolean isEqualSize(Integer Matrix[][], Integer Matrix2[][]) {

        return Matrix.length == Matrix2.length && Matrix[0].length == Matrix2[0].length;

    }

    public void impresion(Integer Matrix[][]) {

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

    public void impresion(Integer Matrix[]) {
        System.out.print("{");

        for (Integer value : Matrix) {
            System.out.print(" " + value + " ");
        }
        System.out.println("}");

    }

    public void impresion(Integer value) {
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
