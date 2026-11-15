
package Informe2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== 1. ArithmeticException ===");
        try {
            System.out.print("Numerador: ");
            int a = Integer.parseInt(sc.nextLine().trim());
            System.out.print("Denominador: ");
            int b = Integer.parseInt(sc.nextLine().trim());
            System.out.println("Resultado: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar números enteros válidos.");
        }

        System.out.println("\n=== 2. NumberFormatException ===");
        try {
            System.out.print("Ingrese un número entero: ");
            int numero = Integer.parseInt(sc.nextLine().trim());
            System.out.println("Número ingresado: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar un número válido.");
        }

        System.out.println("\n=== 3. ArrayIndexOutOfBoundsException ===");
        int[] vector = {10, 20, 30};
        try {
            System.out.println("Posición 3: " + vector[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: La posición no existe en el vector (tamaño " + vector.length + ").");
        }

        System.out.println("\n=== 4. NullPointerException ===");
        String texto = null;
        try {
            System.out.println("Longitud: " + texto.length());
        } catch (NullPointerException e) {
            System.out.println("Error: La variable texto vale null.");
        }

        System.out.println("\n=== 5. StringIndexOutOfBoundsException ===");
        String palabra = "Diego";
        try {
            System.out.println(palabra.charAt(5));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: La posición 5 no existe en \"" + palabra + "\".");
        }

        System.out.println("\n=== 6. InputMismatchException ===");
        try {
            System.out.print("Ingrese su edad (número entero): ");
            int edad = sc.nextInt();
            System.out.println("Edad: " + edad);
        } catch (InputMismatchException e) {
            System.out.println("Error: Escribió un dato que no es un entero.");
        }

        sc.close();
    }
}
