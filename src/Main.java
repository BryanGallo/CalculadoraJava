import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int operation=0;
        int result;
        do {
            System.out.println("*** Aplicacion Calculadora ***");
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
            try {
                operation = Integer.parseInt(consola.nextLine());
                if (operation == 5){
                    System.out.println("Gracias por usar la calculadora Adios");

                }else if( operation < 0 || operation > 5){
                    System.out.println("Opcion equivocada");
                }else{
                    System.out.println("Proporciona el primer valor:");
                    int valor1 = Integer.parseInt(consola.nextLine());
                    System.out.println("Proporciona el segundo valor:");
                    int valor2 = Integer.parseInt(consola.nextLine());
                    switch (operation) {
                        case 1:
                            result = valor1 + valor2;
                            System.out.println("El resultado de la suma es: "+result);
                            break;
                        case 2:
                            result = valor1 - valor2;
                            System.out.println("El resultado de la resta es: "+result);
                            break;
                        case 3:
                            result = valor1 * valor2;
                            System.out.println("El resultado de la multiplicacion es: "+result);
                            break;
                        case 4:
                            result = valor1 / valor2;
                            System.out.println("El resultado de la division es: "+result);
                            break;
                        case 5:
                            System.out.println("Gracias por usar la calculadora Adios");
                            break;
                    }
                }
            }catch (Exception e){
                System.out.println("Ocurrio un error" + e.getMessage());
            }
        }while(operation != 5);

    }
}