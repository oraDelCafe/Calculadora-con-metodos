package daw;

import javax.swing.JOptionPane;

public class MetodosCalculadora {
    // Aqui voy ha hacer los metodos
    // voy a probar
    public static String Menu(String texto) {
        // imprime texto y recoge datos
        String respuesta = "";

        respuesta = JOptionPane.showInputDialog(texto);

        return respuesta;
    }

    public static int PreguntarNumero() {
        // pide numero y devuelve
        int respuestaInt = 0;
        do {
            respuestaInt = Integer.parseInt(JOptionPane.showInputDialog("Intoduce numero"));
            if (respuestaInt >= 0) {
                JOptionPane.showInputDialog("Intoduce numero Mayor o igual que 0");
            }
        } while (!(respuestaInt >= 0));
        return respuestaInt;

    }

    public static int Sumar(int a, int b) {
        // suma
        return a + b;
    }

    public static int Restar(int a, int b) {
        // Resta
        return a - b;
    }

    public static int Multiplicar(int a, int b) {
        // Multiplica
        return a * b;
    }

    public static double Dividir(int a, int b) {
        // Divide
        return a / b;
    }
}
