
package Informe2;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la nota del estudiante: ");
        double nota = sc.nextDouble();

        if (nota < 0 || nota > 5) {
            System.out.println("Nota no valida");
        } else if (nota >= 4.5) {
            System.out.println("Desempeño excelente");
        } else if (nota >= 4.0) {
            System.out.println("Desempeño sobresaliente");
        } else if (nota >= 3.0) {
            System.out.println("Desempeño aceptable");
        } else {
            System.out.println("Desempeño insuficiente");
        }

        sc.close();
    }
}
