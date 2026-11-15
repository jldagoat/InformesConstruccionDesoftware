package Informe1;


public class Ejercicio14 {
    public static void main(String[] args) {
        String producto = "Celular";
        double precio = 1200000;
        double porcentajeDescuento = 15;

        double descuento = precio * porcentajeDescuento / 100;
        double precioFinal = precio - descuento;

        System.out.println("Producto: " + producto);
        System.out.println("Precio original: " + precio);
        System.out.println("Descuento: " + descuento);
        System.out.println("Precio final: " + precioFinal);
    }
}
