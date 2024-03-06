package Pratik.Arrays;

import java.util.Arrays;

public class MatrisTranspozu {
    public static void main(String[] args) {
        int[][] matris =
                {
                        {1,2,3},
                        {4,5,6}
                };

        int[][] matrisTranspoz = new int[3][2];


        for (int i = 0; i < matris.length ; i++) {
            for (int j = 0; j < matris[i].length ; j++){
                matrisTranspoz[j][i] = matris[i][j];
            }
        }

        for (int row = 0; row < matrisTranspoz.length; row++) {
            for (int column = 0; column < matrisTranspoz[row].length; column++) {
                System.out.print(matrisTranspoz[row][column] + " ");
            }
            System.out.println();
        }
    }
}
