
package Informe2;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int numero1 = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int numero2 = sc.nextInt();

        System.out.print("Ingrese el tercer numero: ");
        int numero3 = sc.nextInt();

        if (numero1 >= numero2 && numero1 >= numero3) {
            System.out.println("El numero mayor es: " + numero1);
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            System.out.println("El numero mayor es: " + numero2);
        } else {
            System.out.println("El numero mayor es: " + numero3);
        }

        sc.close();
    }
}
