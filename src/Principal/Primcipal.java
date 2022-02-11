package Principal;

import java.util.Scanner;

/**
 * @author Lautaro Toloza
 */
public class Primcipal {

    public static void main(String[] args) {
//      Consigna 1:
//      Ingresar un número por teclado y indicar su paridad.
        System.out.println("---------------------------------");
        System.out.println("Indicador de paridad..");
        int num = CargarNumero("Ingrese el número: ");
        Paridad(num);

//      Consigna 2: 
//      Ingresar tres números y indicar el mayor.
        System.out.println("\nIndicador del mayor número..");
        int num1 = CargarNumero("Ingrese el primer número: ");
        int num2 = CargarNumero("Ingrese el segundo número: ");
        int num3 = CargarNumero("Ingrese el tercer número: ");
        MayorNumero(num1, num2, num3);
        System.out.println("---------------------------------");
    }

    public static int CargarNumero(String texto) {
        Scanner leer = new Scanner(System.in);
        System.out.print(texto);
        String numStr = leer.nextLine();
        int num = Integer.parseInt(numStr);

        return num;

    }

    public static void Paridad(int n) {
        if (n % 2 == 0) {
            System.out.println("El número ingresado es par!! ");
        } else {
            System.out.println("El número ingresado es impar!!");
        }
    }

    public static void MayorNumero(int n1, int n2, int n3) {
        int mayor = n1;
        if (n2 >= n3) {
            if (n2 >= n1) {
                mayor = n2;
            }
        } else {
            if (n3 > n1) {
                mayor = n3;
            }
        }
        System.out.println("El mayor es: " + mayor);

    }

}
