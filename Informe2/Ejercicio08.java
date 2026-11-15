
package Informe2;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();

        System.out.println("Longitud: " + frase.length());
        System.out.println("Mayusculas: " + frase.toUpperCase());
        System.out.println("Minusculas: " + frase.toLowerCase());
        System.out.println("Sin espacios externos: " + frase.trim());
        System.out.println("Contiene Java: " + frase.contains("Java"));
        System.out.println("Reemplazar espacios: " + frase.replace(" ", "_"));

        sc.close();
    }
}
