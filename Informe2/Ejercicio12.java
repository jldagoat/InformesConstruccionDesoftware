
package Informe2;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el valor de n: ");
        int n = sc.nextInt();

        System.out.println("Números pares entre 0 y " + n + " (10 por renglón):");
        for (int inicio = 0; inicio <= n; inicio += 20) {
            for (int i = inicio; i <= n && i < inicio + 20; i += 2) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
