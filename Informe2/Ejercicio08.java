
package Informe2;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad < 0) {
            System.out.println("Edad no valida");
        } else if (edad <= 12) {
            System.out.println("Es un niño");
        } else if (edad <= 17) {
            System.out.println("Es un adolescente");
        } else if (edad <= 59) {
            System.out.println("Es un adulto");
        } else {
            System.out.println("Es un adulto mayor");
        }

        sc.close();
    }
}