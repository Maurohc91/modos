package org.example;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;
public class actividadmodos {

    public void modo1() {

        System.out.println("BIENVENIDO A LA CLASIFICACION DE GENERACIONES");
        System.out.println("Elige un modo: ");
        System.out.println("1. Año de nacimiento");
        System.out.println("2. Edad");


        Scanner teclado = new Scanner(System.in);

        String modo = teclado.next();

        LocalDateTime hoy = LocalDateTime.now();
        int anyo_actual = hoy.getYear();
        int anyo_nacimiento = 1800;


        boolean error = false;



        if (modo.equals("1")) {

            System.out.println("Introduce tu año de nacimiento: ");
            String anyo = teclado.next();

            try {
                anyo_nacimiento = Integer.parseInt(anyo);
            } catch (NumberFormatException e1) {
                System.out.println("El formato del año no es correcto. " + e1.getMessage());
            }

            if (anyo_nacimiento < 1900 || anyo_nacimiento > anyo_actual) {
                System.out.println("El año introducido no es correcto.");
                error =true;
            }

        } else if (modo.equals("2")) {
            System.out.println("Introduce tu edad: ");

            int edad = 0;

            if (teclado.hasNextInt()){
                edad =teclado.nextInt();

            }else{
                System.out.println("El formato de la edad es incorrecto.");
                error = true;
            }


            if (edad < 0) {
                System.out.println("La edad introducida no es correcta");
                error = true;
            } else {
                anyo_nacimiento = anyo_actual - edad;
            }


        } else {
            System.out.println("El modo no existe");
            error = true;

        }

        if (error==false){

            if (anyo_nacimiento >= 1900 && anyo_nacimiento <= 1927) {
                System.out.println("Eres de la generacion sin bautizar.");

            } else if (anyo_nacimiento >= 1928 && anyo_nacimiento <= 1944) {
                System.out.println("Eres de la generacion Silent.");
            } else if (anyo_nacimiento >= 1945 && anyo_nacimiento <= 1964) {
                System.out.println("Eres de la generacion Baby Boomers.");
            } else if (anyo_nacimiento >= 1965 && anyo_nacimiento <= 1981) {
                System.out.println("Eres de la generacion X.");
            } else if (anyo_nacimiento >= 1982 && anyo_nacimiento <= 1994) {
                System.out.println("Eres de la mejor generacion. Millenails.");
            } else if (anyo_nacimiento >= 1995 && anyo_nacimiento <= anyo_actual) {
                System.out.println("Eres de la generacion Centennials.");
            } else {
                System.out.println("No tienes generación");

            }
        }
    }
}
