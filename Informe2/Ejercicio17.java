
package Informe2;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese las horas trabajadas: ");
        int horas = sc.nextInt();

        System.out.print("Ingrese el pago por hora: ");
        double pagoHora = sc.nextDouble();

        double salario = 0;

        if (horas < 0 || pagoHora <= 0) {
            System.out.println("Datos no validos");
        } else if (horas <= 40) {
            salario = horas * pagoHora;
            System.out.println("Salario total: " + salario);
        } else {
            int horasExtras = horas - 40;

            double salarioNormal = 40 * pagoHora;
            double pagoExtra = horasExtras * pagoHora * 1.5;

            salario = salarioNormal + pagoExtra;

            System.out.println("Horas extras: " + horasExtras);
            System.out.println("Pago por horas extras: " + pagoExtra);
            System.out.println("Salario total: " + salario);
        }

        sc.close();
    }
}
