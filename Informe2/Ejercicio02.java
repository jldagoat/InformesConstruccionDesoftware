package Informe2;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer número entero: ");
        int primero = sc.nextInt();
        System.out.print("Ingresa el segundo número entero: ");
        int segundo = sc.nextInt();

        if (primero > segundo) {
            System.out.println("El primero (" + primero + ") es mayor que el segundo (" + segundo + ").");
        }
        if (segundo > primero) {
            System.out.println("El segundo (" + segundo + ") es mayor que el primero (" + primero + ").");
        }
        if (primero == segundo) {
            System.out.println("Los dos números son iguales.");
        }

        sc.close();
    }
}