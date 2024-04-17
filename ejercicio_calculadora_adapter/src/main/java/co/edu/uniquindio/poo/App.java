package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Calculadora calculadoraEntero = new Calculadora();
        CalculadoraDecimalClase calculadoraDecimal = new CalculadoraDecimalClase();
        AdaptadorCalculadora adaptador = new AdaptadorCalculadora(calculadoraDecimal);

        int resultadoEntero = calculadoraEntero.sumar(1, 2);
        System.out.println("El resultado de los 2 números enteros es: " + resultadoEntero);

        double resultadoDecimal = adaptador.sumar(3, 6);
        System.out.println("El resultado de los 2 números decimales es: " + resultadoDecimal);

    }
}

