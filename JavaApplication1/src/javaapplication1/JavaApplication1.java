
package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {

        int n1, n2;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer numero");
        n1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero");
        n2 = teclado.nextInt();

        int suma = n1 + n2;

        System.out.println("El resultado de la suma es: " + suma);

    }

}
