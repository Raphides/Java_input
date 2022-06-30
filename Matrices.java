import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        float[][] matriz = createMatrix(5, 3);
        seeMatrixOn2D(matriz);
    }
    
    protected static float[][] createMatrix(int linhas, int colunas){
        Scanner elementos = new Scanner(System.in);

        float[][] matriz = new float[linhas][colunas];
        System.out.printf("Insira %d elementos à sua matriz:\n", linhas + colunas);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++){
                System.out.printf("Elemento na linha %d, coluna %d:\n", i, j);
                float elemento = elementos.nextFloat();
                matriz[i][j] = elemento;
            }
        }
        elementos.close();
        return matriz;
    }
    protected static void seeMatrixOn2D(float[][] matriz) {
        for (float[] l: matriz) {
            for (float e: l) {
                System.out.printf("%f ", e);
            }
            System.out.println();
        }
    }
    protected static void seeMatrixOn2D(int linhas, int colunas) {
        float[][] matriz = createMatrix(linhas, colunas);
        for (float[] l: matriz) {
            for (float e: l) {
                System.out.printf("%f ", e);
            }
            System.out.println();
        }
    }
    
}
