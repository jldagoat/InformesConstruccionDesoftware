
package Informe2;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Día de la semana: ");
        String dia = sc.nextLine().trim().toLowerCase().replace("é", "e");

        System.out.print("Producto (fruver, carnes, vinos): ");
        String producto = sc.nextLine().trim().toLowerCase();

        System.out.print("Valor del producto: ");
        double valor = Double.parseDouble(sc.nextLine().trim().replace(',', '.'));

        int descuento = 0;

        if (dia.equals("lunes")) {
            if (producto.equals("fruver")) {
                descuento = 30;
            }
        } else if (dia.equals("martes")) {
            if (producto.equals("carnes")) {
                descuento = 30;
            }
        } else if (dia.equals("miercoles")) {
            if (producto.equals("carnes")) {
                descuento = 15;
            } else if (producto.equals("fruver")) {
                descuento = 10;
            } else if (producto.equals("vinos")) {
                descuento = 5;
            }
        } else if (dia.equals("jueves")) {
            if (producto.equals("vinos")) {
                descuento = 30;
            }
        } else if (dia.equals("viernes")) {
            if (producto.equals("vinos")) {
                descuento = 15;
            } else if (producto.equals("fruver")) {
                descuento = 10;
            } else if (producto.equals("carnes")) {
                descuento = 5;
            }
        }

        double costoTotal = valor - (valor * descuento / 100);

        System.out.println("\"Descuento: " + descuento + "%");

        if (costoTotal == Math.floor(costoTotal)) {
            System.out.println("Costo Total: " + (long) costoTotal + "\"");
        } else {
            System.out.println("Costo Total: " + costoTotal + "\"");
        }

        sc.close();
    }
}
