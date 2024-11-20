package Taller7.Ejercicio3;

public class Utilidades {

    
    public double sumar(double a, double b) {
        return a + b;
    }

   
    public double restar(double a, double b) {
        return a - b;
    }

    
    public double multiplicar(double a, double b) {
        return a * b;
    }

    
    public double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0; 
        }
    }
}
