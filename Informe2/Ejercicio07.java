package Informe2;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la primera nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        double nota3 = sc.nextDouble();

        double definitiva = (nota1 + nota2 + nota3) / 3;

        System.out.println("Nota definitiva: " + definitiva);

        if (definitiva >= 3.0) {
            System.out.println("El estudiante aprobo");
        } else {
            System.out.println("El estudiante reprobo");
        }

        sc.close();
    }
}
