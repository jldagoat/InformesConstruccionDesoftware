
package Informe2;

public class Ejercicio17 {
    public static void main(String[] args) {
        int numeros[][] = new int[5][4];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                numeros[i][j] = (int) (Math.random() * 101);
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%5d", numeros[i][j]);
            }
            System.out.println();
        }
    }
}
