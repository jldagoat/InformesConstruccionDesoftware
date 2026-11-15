
public class Ejercicio21 {
    public static void main(String[] args) {
        int numero = 5;

        System.out.println("Valor inicial: " + numero);

        numero++;
        System.out.println("Incremento: " + numero);

        numero--;
        System.out.println("Decremento: " + numero);

        System.out.println("Preincremento: " + (++numero));
        System.out.println("Postincremento: " + (numero++));
        System.out.println("Valor final: " + numero);
    }
}
