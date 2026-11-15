
package Informe2;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer lado: ");
        double lado1 = sc.nextDouble();

        System.out.print("Ingrese el segundo lado: ");
        double lado2 = sc.nextDouble();

        System.out.print("Ingrese el tercer lado: ");
        double lado3 = sc.nextDouble();

        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            System.out.println("Los lados deben ser positivos");
        } else if (lado1 + lado2 <= lado3 ||
                   lado1 + lado3 <= lado2 ||
                   lado2 + lado3 <= lado1) {
            System.out.println("Los lados no forman un triangulo");
        } else if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("El triangulo es equilatero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("El triangulo es isosceles");
        } else {
            System.out.println("El triangulo es escaleno");
        }

        sc.close();
    }
}
