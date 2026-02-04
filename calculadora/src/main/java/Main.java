import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.print("Ingrese el primer número: ");
        double n1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double n2 = sc.nextDouble();

        System.out.println("Suma: " + calc.sumar(n1, n2));
        System.out.println("Resta: " + calc.restar(n1, n2));
        System.out.println("Multiplicación: " + calc.multiplicar(n1, n2));
        System.out.println("División: " + calc.dividir(n1, n2));
    }
}

