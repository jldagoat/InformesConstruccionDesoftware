package Informe2;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        sc.nextLine();

        System.out.print("Ingrese la capital de Colombia: ");
        String capital = sc.nextLine();

        if (capital.equalsIgnoreCase("Bogota")) {
            System.out.println("Respuesta correcta");
        } else {
            System.out.println("Respuesta incorrecta");
        }

        sc.close();
    }
}
