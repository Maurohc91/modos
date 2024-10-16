package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class bateria {

    public void ejercicio1() {

        String frase = "Este texto va a ser con el que vamos a trabajar.";

        //0
        System.out.println(frase);

        //1
        int tamanyo = frase.length();
        System.out.println("El tamaño de la frase es " + tamanyo);

        //2
        String reemplazar = frase.replace(" ", "");
        System.out.println(reemplazar);

        //3
        String mitad1 = frase.substring(0, 24);
        System.out.println("La primera mitad es " + mitad1);

        String mitad2 = frase.substring(24, 48);
        System.out.println("La segunda mitad es " + mitad2);

        String concatenacion = frase.concat(frase);
        System.out.println(mitad1 + mitad2);

        //4
        String mayusculas = frase.toUpperCase();
        System.out.println(mayusculas);

    }

    public void ejercicio2() {

        String frase1 = "Esta es la frase numero uno";
        String frase2 = "Esta va a ser más corta";

        int tamanyo1 = frase1.length();
        int tamanyo2 = frase2.length();

        if (tamanyo1 > tamanyo2) {
            System.out.println("La frase mas larga es la frase numero 1");
        } else {
            System.out.println("La frase mas larga es la frase numero 2");
        }

    }

    public void ejercicio3() {

        Scanner teclado = new Scanner(System.in);
        boolean err = true;
        int n = 0;
        int m = 0;


        while (err) {

            try {
                System.out.println("Introduce un numero....");
                n = teclado.nextInt();

                System.out.println("Introduce un numero para quitar las cifras al anterior....");
                m = teclado.nextInt();
                if (n > m) {
                    err = false;
                } else {
                    System.out.println("No se pueden quitar mas cifras de las que hay");
                }


            } catch (InputMismatchException e) {
                System.out.println("el formato no es correcto (numerico)");
                teclado.nextLine();

            }
        }


        String n_string = Integer.toString(n);
        int tamanyo = n_string.length();

        n_string = n_string.substring(0, tamanyo - m);

        System.out.println("El numero sin las " + m + " cifras es " + n_string);


    }

    public void ejercicio4() {

        Scanner teclado = new Scanner(System.in);


        System.out.println("Introduce una frase: ");
        String frase = teclado.nextLine();
        frase = " " + frase + " ";
        //frase= frase.replaceAll("[\\p{Alpha}]", " "); //eliminamos todos los caracteres especiales
        frase = frase.replace(".", " ");
        frase = frase.toLowerCase();


        System.out.println("Introduce una subcadena: ");
        String subcadena = teclado.nextLine();
        subcadena = " " + subcadena + " ";


        int fraselength = frase.length();
        int fraseinsubcadena = frase.replace(subcadena, "").length();

        int division = ((fraselength - fraseinsubcadena) / subcadena.length());
        System.out.println(division);


    }


    public void ejercicio5() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Jugador 1. Introduzca una frase: ");
        String frase = teclado.nextLine();
        frase = " " + frase + " ";


        int intentos = 10;
        boolean acierto = false;


        while (intentos > 0 && !acierto) {
            System.out.println("Jugador 2. Introduzca una palabra: ");
            String palabra = teclado.nextLine();
            palabra = " " + palabra + " ";


            boolean contiene = frase.contains(palabra);

            if (contiene) {
                acierto = true;
                System.out.println("ENHORABUENA! Has acertado la palabra.");

            } else {
                intentos--;
                System.out.println("Intento fallido. Te quedan " + intentos + " intentos.");

            }


        if (intentos == 0) {
            System.out.println("Se han agotado los intentos. FIN DEL JUEGO");
            }

        }
    }
}
