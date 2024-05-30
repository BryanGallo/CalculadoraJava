import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int operation;
        do {
            System.out.println("*** Aplicacion Calculadora ***");
            System.out.println("Proporciona el primer valor:");
            int valor1 = Integer.parseInt(consola.nextLine());
            System.out.println("Proporciona el segundo valor:");
            int valor2 = Integer.parseInt(consola.nextLine());
            //Menu
            System.out.println("*** Que operacion deseas hacer ***");
            System.out.println("""
                1.Suma
                2.Resta
                3.Multiplicacion
                4.Division
                5.Salir
                """);
            System.out.println("Que opcion elijes?");
            operation = Integer.parseInt(consola.nextLine());
            switch (operation) {
                case 1:
                    System.out.println("SUMA");
                    break;
                case 2:
                    System.out.println("RESTA");
                    break;
                case 3:
                    System.out.println("MULTIPLICACION");
                    break;
                case 4:
                    System.out.println("DIVISION");
                    break;
                case 5:
                    System.out.println("Gracias por usar la calculadora Adios");
                    break;
                default:
                    System.out.println("Opcion equivocada");
            }
        }while(operation != 5);

    }
}