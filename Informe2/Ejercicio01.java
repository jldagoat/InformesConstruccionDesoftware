package Informe2;

import java.util.Scanner;


public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println(nombre + " tiene " + edad + " años.");

    
        System.out.print("Ingresa el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int b = scanner.nextInt();
        System.out.println("Suma: " + (a + b));

        System.out.print("Ingresa un número entero: ");
        if (scanner.hasNextInt()) {
            int numero = scanner.nextInt();
            System.out.println("Ingresaste el número " + numero);
        } else {
            System.out.println("¡Debes ingresar un número!");
        }

        scanner.close();
    }
}