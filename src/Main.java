import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("*** Aplicacion Calculadora ***");
        System.out.println("Proporciona el primer valor:");
        int valor1 = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el segundo valor:");
        int valor2 = Integer.parseInt(consola.nextLine());
        int result = valor1 + valor2;

        System.out.print("El resultado es: ");
        System.out.println(result);
    }
}