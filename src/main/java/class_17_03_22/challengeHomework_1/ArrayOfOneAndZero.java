package class_17_03_22.challengeHomework_1;

public class ArrayOfOneAndZero {

    public int[][] oneAndZero(int size){

        int[][] matrix = new int[size][size];
        for (int i = 0; i<matrix[0].length;i++){
            for (int x = 0; x<matrix[1].length;x++){
                matrix[i][x] = (i-x == 0 || (matrix.length - 1)-x == i || i == 0 || i == matrix.length-1) ? 1 : 0;
                //System.out.print(matrix[i][x]);
            }
            //System.out.println();
        }
        return matrix;
    }

    //condicional 1: fila - columna == 0
    //condicional 2: (tamaño de la matriz - 1) - columna = fila
    //condicional 3: fila == 0
    //condicional 4: fila == tamaño de la matriz - 1


}
