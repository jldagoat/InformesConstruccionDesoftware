
package Informe2;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el valor de n: ");
        int n = sc.nextInt();

        System.out.println("Números pares entre 0 y " + n + ":");
        for (int i = 0; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        sc.close();
    }
}
