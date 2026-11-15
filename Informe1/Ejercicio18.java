package Informe1;


public class Ejercicio18 {
    public static void main(String[] args) {
        String producto = "Computador";
        double precio = 2000000;
        double iva = 19;

        double valorIVA = precio * iva / 100;
        double precioFinal = precio + valorIVA;

        System.out.println("Producto: " + producto);
        System.out.println("Precio sin IVA: " + precio);
        System.out.println("IVA: " + valorIVA);
        System.out.println("Precio final: " + precioFinal);
    }
}
