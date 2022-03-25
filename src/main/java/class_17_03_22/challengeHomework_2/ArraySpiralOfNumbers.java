package class_17_03_22.challengeHomework_2;

public class ArraySpiralOfNumbers {



    public int[][] spiralArray(int size){
        int arriba = size - 1;
        int abajo = 0;
        int derecha = size - 1;
        int izquierda = 0;
        int count = 0;
        int[][] matrix = new int[size][size];

        while (count != size*size){
            for(int i =abajo; i<=arriba;i++){
                matrix[abajo][i]=++count;
            }
            for (int i = izquierda + 1;i<=derecha;i++){
                matrix[i][derecha]=++count;
            }
            for(int i = arriba -1 ; i>=abajo;i--){
                matrix[arriba][i]=++count;
            }
            for(int i = derecha -1;i>=izquierda +1;i--){
                matrix[i][izquierda]=++count;
            }
            arriba--;abajo++;derecha--;izquierda++;
        }
        //para imprimir
        /*for (int[] num: matrix){
            System.out.println(Arrays.toString(num));
        }*/
        return matrix;

    }
}
