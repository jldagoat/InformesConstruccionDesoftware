
package Informe2;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad");

            System.out.print("Tiene licencia de conducir? (si/no): ");
            String licencia = sc.next();

            if (licencia.equalsIgnoreCase("si")) {
                System.out.println("Puede conducir");
            } else {
                System.out.println("No puede conducir sin licencia");
            }
        } else {
            System.out.println("Es menor de edad");
            System.out.println("No puede conducir");
        }

        sc.close();
    }
}
