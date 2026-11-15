
public class Ejercicio30 {
    public static void main(String[] args) {
        int numero1 = 15;
        int numero2 = 30;
        int numero3 = 45;

        System.out.println("Mayor entre 15 y 30: " + Math.max(numero1, numero2));
        System.out.println("Mayor entre 30 y 45: " + Math.max(numero2, numero3));
        System.out.println("Mayor entre los tres: " + Math.max(Math.max(numero1, numero2), numero3));
    }
}
