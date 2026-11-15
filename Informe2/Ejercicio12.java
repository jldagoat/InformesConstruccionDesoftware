
package Informe2;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de la compra: ");
        double compra = sc.nextDouble();

        double descuento = 0;

        if (compra < 0) {
            System.out.println("Valor de compra no valido");
        } else {
            if (compra >= 200000) {
                descuento = compra * 0.20;
            } else if (compra >= 100000) {
                descuento = compra * 0.10;
            } else if (compra >= 50000) {
                descuento = compra * 0.05;
            }

            double total = compra - descuento;

            System.out.println("Valor de la compra: " + compra);
            System.out.println("Descuento aplicado: " + descuento);
            System.out.println("Total a pagar: " + total);
        }

        sc.close();
    }
}
