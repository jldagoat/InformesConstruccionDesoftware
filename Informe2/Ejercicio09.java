
package Informe2;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double numero1 = sc.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        double numero2 = sc.nextDouble();

        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        System.out.print("Seleccione una opcion: ");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.println("Resultado: " + (numero1 + numero2));
        } else if (opcion == 2) {
            System.out.println("Resultado: " + (numero1 - numero2));
        } else if (opcion == 3) {
            System.out.println("Resultado: " + (numero1 * numero2));
        } else if (opcion == 4) {
            if (numero2 != 0) {
                System.out.println("Resultado: " + (numero1 / numero2));
            } else {
                System.out.println("No se puede dividir entre cero");
            }
        } else {
            System.out.println("Opcion no valida");
        }

        sc.close();
    }
}
