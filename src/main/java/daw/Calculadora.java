package daw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        /**
         * Hago la calculadora con metodos
         */

        boolean salir = false;
        Scanner sc = new Scanner(System.in);
        int opcionElegida, operando1 = 0, operando2 = 0;

        String textoMenu = """
                Calculadora:
                1-.Sumar
                2-.Restar
                3-.Multiplicar
                4-.Dividir
                5-.Salir
                """;

        do {
            opcionElegida = 0;

            System.out.println(textoMenu);

            try {
                opcionElegida = sc.nextInt();

                switch (opcionElegida) {
                    case 1 -> {
                    }
                    case 2 -> {
                    }
                    case 3 -> {
                    }
                    case 4 -> {
                    }
                    case 5 -> {
                    }
                    default -> {
                        System.out.println("Numero fuera de rango");
                    }
                }

            } catch (InputMismatchException ime) {
                System.out.println("Has metido una letra");
            }

        } while (!salir);

    }

}