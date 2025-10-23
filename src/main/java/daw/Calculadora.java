package daw;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {
        /**
         * Hago la calculadora con metodos
         */

        boolean salir = false;
        Scanner sc = new Scanner(System.in);
        int opcionElegida, operando1 = 0, operando2 = 0;

        final String TEXTO_MENU = """
                \n
                    Calculadora:
                    1-.Sumar
                    2-.Restar
                    3-.Multiplicar
                    4-.Dividir
                    5-.Salir
                    """;

        do {

            opcionElegida = 0;
            // renuevo vatiable.
            try {
                // do {
                // controlo opciones
                opcionElegida = Integer.parseInt(MetodosCalculadora.Menu(TEXTO_MENU));
                // } while (opcionElegida > 0 && opcionElegida < 6);
                // 1 2 3 4 5 no hace falta ya que controlo por default

                switch (opcionElegida) {
                    case 1 -> {
                        // suma
                        // pido numeros
                        operando1 = MetodosCalculadora.PreguntarNumero();
                        operando2 = MetodosCalculadora.PreguntarNumero();
                        JOptionPane.showMessageDialog(null,
                                "La suma de es = " + MetodosCalculadora.Sumar(operando1, operando2));

                    }
                    case 2 -> {
                        // resta
                        // pido numeros
                        operando1 = MetodosCalculadora.PreguntarNumero();
                        operando2 = MetodosCalculadora.PreguntarNumero();

                        JOptionPane.showMessageDialog(null,
                                "La resta de es = " + MetodosCalculadora.Restar(operando1, operando2));

                    }
                    case 3 -> {
                        // multiplico
                        // pido numeros
                        operando1 = MetodosCalculadora.PreguntarNumero();
                        operando2 = MetodosCalculadora.PreguntarNumero();
                        JOptionPane.showMessageDialog(null,
                                "La multiplicacion de es = " + MetodosCalculadora.Multiplicar(operando1, operando2));

                    }
                    case 4 -> {
                        // Divido
                        // pido numeros
                        operando1 = MetodosCalculadora.PreguntarNumero();
                        operando2 = MetodosCalculadora.PreguntarNumero();
                        try {
                            JOptionPane.showMessageDialog(null,
                                    "La division de es = " + MetodosCalculadora.Dividir(operando1, operando2));
                        } catch (ArithmeticException ae) {
                            JOptionPane.showMessageDialog(null, "No se puede dividir por 0 ");
                        }

                    }
                    case 5 -> {
                        // sale
                        JOptionPane.showMessageDialog(null, "Adios");
                        salir = true;
                    }
                    default -> {
                        JOptionPane.showMessageDialog(null, "Numero fuera de rango");
                    }
                }

            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Has introducido una letra");

            }

        } while (!salir);

    }

}