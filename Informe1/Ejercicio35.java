
public class Ejercicio35 {
    public static void main(String[] args) {
        double numeroAleatorio = Math.random();

        int numero1 = (int) (Math.random() * 10) + 1;
        int numero2 = (int) (Math.random() * 100) + 1;

        System.out.println("Numero aleatorio entre 0 y 1: " + numeroAleatorio);
        System.out.println("Numero aleatorio entre 1 y 10: " + numero1);
        System.out.println("Numero aleatorio entre 1 y 100: " + numero2);
    }
}
