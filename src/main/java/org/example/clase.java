package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;


public class clase {

    public void caracteres() {

        String frase = "No me porto mal en clase y no lo reconzco.";

        int tamanyo = frase.length();
        System.out.println("El tamaño de la frase es " + tamanyo);

        char letra = frase.charAt(33);
        System.out.println("La letra en la posicion 33 es " + letra);

        String palabra = frase.substring(9, 12);
        System.out.println("La palabra con substring es " + palabra);

        String palabra2 = " Parte.";
        String concatenacion = frase.concat(palabra2);
        System.out.println("La concatenación de la frase con la palabra " + palabra2 + " es " + concatenacion);


        int posicion = concatenacion.indexOf(palabra2);
        System.out.println("La palabra " + palabra2 + " esta en la posicion " + posicion);

        int posicion2 = concatenacion.indexOf("no", 8);
        System.out.println("La posicion de la palabra 'no' si no tenemos en cuenta las 8 primeras posiciones es " + posicion2);

        int posicion3 = concatenacion.lastIndexOf("no");
        System.out.println("La posicion de la ultima aparicion de la palabra 'no' es " + posicion3);

        String mayusculas = frase.toUpperCase();
        System.out.println("La frase en mayusculas es " + mayusculas);

        String minusculas = frase.toLowerCase();
        System.out.println("La frase en minusculas es " + minusculas);

        String nombre = "Mauro                      ";
        nombre = nombre.trim();
        System.out.println("tu nombre sin espacios es " + nombre + ".");

        String reemplazar = frase.replace("mal", "bien");
        System.out.println("la frase con la palabra 'mal' reemplazada por 'bien' queda así " + reemplazar);
        String reemplazarespacios = reemplazar.replace(" ", "");
        System.out.println("La frase sin espacios queda " + reemplazarespacios);

        String palabra3 = "hola";
        String palabra4 = "Hola";

        if (palabra3.equals(palabra4) == true) {
            System.out.println("las palabras " + palabra3 + " y " + palabra4 + " son iguales");
        } else {
            System.out.println("las palabras " + palabra3 + " y " + palabra4 + " son diferentes");

        }
//da igual minusculas que mayusculas

        if (palabra3.equalsIgnoreCase(palabra4) == true) {
            System.out.println("las palabras " + palabra3 + " y " + palabra4 + " son iguales");
        } else {
            System.out.println("las palabras " + palabra3 + " y " + palabra4 + " son diferentes");

        }





    }




















    }






