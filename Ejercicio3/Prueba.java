package Taller7.Ejercicio3;

public class Prueba{
    public static void main(String[] args) {
      
        Utilidades utilidades = new Utilidades();

       
        double a = 10;
        double b = 5;
        
       
        System.out.println("Suma de " + a + " y " + b + " = " + utilidades.sumar(a, b));

    
        System.out.println("Resta de " + a + " y " + b + " = " + utilidades.restar(a, b));

        
        System.out.println("Multiplicación de " + a + " y " + b + " = " + utilidades.multiplicar(a, b));

        
        System.out.println("División de " + a + " entre " + b + " = " + utilidades.dividir(a, b));

        
        double c = 0;
        System.out.println("División de " + a + " entre " + c + " = " + utilidades.dividir(a, c));
    }
}
