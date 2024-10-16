package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;
public class excepciones {
    public void nuevasexpcepciones() {


        Scanner teclado = new Scanner(System.in);

        System.out.println("dividendo");

        boolean error = false;

        int dividendo = 0;

        if (teclado.hasNextInt() == true) {
            dividendo = teclado.nextInt();

        } else {
            System.out.println("has intorducido un formato incorrecto");
            error = true;
        }
        int divisor_entero = 0;

        if (error == false) {
            System.out.println("divisor");
            String divisor = teclado.next();


            if (error == false) {
                try {
                    divisor_entero = Integer.parseInt(divisor);

                } catch (NumberFormatException e1) {
                    System.out.println("el divisor introducido no es un numero. " + e1.getMessage());
                }

            }

        }
        if (error == false) {


            int resultado = 0;

            try {
                resultado = dividendo / divisor_entero;

            } catch (ArithmeticException e2) {
                System.out.println("no se puede dividir entre 0" + e2.getMessage());
            }
            System.out.println("resultado = " + resultado);

        }
    }
}
