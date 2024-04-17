package co.edu.uniquindio.poo;

public class AdaptadorCalculadora implements CalculadoraEntero{
    private CalculadoraDecimalClase calculadoraDecimal;


    public AdaptadorCalculadora(CalculadoraDecimalClase calculadoraDecimal) {
        this.calculadoraDecimal = calculadoraDecimal;
    }


    @Override
    public int sumar(int num1, int num2) {
        return (int) calculadoraDecimal.sumar(num1,num2);
    }

}