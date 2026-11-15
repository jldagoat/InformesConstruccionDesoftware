
package Informe2;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 500000;

        System.out.println("Bienvenido al cajero automatico");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Depositar dinero");

        System.out.print("Seleccione una opcion: ");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.println("Su saldo es: " + saldo);
        } else if (opcion == 2) {
            System.out.print("Ingrese el valor a retirar: ");
            double retiro = sc.nextDouble();

            if (retiro <= 0) {
                System.out.println("Valor no valido");
            } else if (retiro <= saldo) {
                saldo = saldo - retiro;
                System.out.println("Retiro exitoso");
                System.out.println("Saldo actual: " + saldo);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else if (opcion == 3) {
            System.out.print("Ingrese el valor a depositar: ");
            double deposito = sc.nextDouble();

            if (deposito > 0) {
                saldo = saldo + deposito;
                System.out.println("Deposito exitoso");
                System.out.println("Saldo actual: " + saldo);
            } else {
                System.out.println("Valor no valido");
            }
        } else {
            System.out.println("Opcion no valida");
        }

        sc.close();
    }
}
