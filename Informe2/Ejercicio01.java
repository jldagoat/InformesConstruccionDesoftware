package Informe2;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        System.out.println("Hola " + nombre);
        System.out.println("Tu edad es: " + edad);

        sc.close();
    }
}
