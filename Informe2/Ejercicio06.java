
package Informe2;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la velocidad del vehiculo: ");
        int velocidad = sc.nextInt();

        System.out.print("Ingrese el limite de velocidad: ");
        int limite = sc.nextInt();

        if (velocidad <= limite) {
            System.out.println("Velocidad permitida");
        } else {
            int exceso = velocidad - limite;

            System.out.println("Ha superado el limite de velocidad");
            System.out.println("Exceso de velocidad: " + exceso + " km/h");

            if (exceso <= 20) {
                System.out.println("Infraccion leve");
            } else {
                System.out.println("Infraccion grave");
            }
        }

        sc.close();
    }
}
