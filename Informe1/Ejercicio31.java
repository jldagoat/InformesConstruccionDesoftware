package Informe1;


public class Ejercicio31 {
    public static void main(String[] args) {
        int numero1 = 15;
        int numero2 = 30;
        int numero3 = 45;

        System.out.println("Menor entre 15 y 30: " + Math.min(numero1, numero2));
        System.out.println("Menor entre 30 y 45: " + Math.min(numero2, numero3));
        System.out.println("Menor entre los tres: " + Math.min(Math.min(numero1, numero2), numero3));
    }
}
