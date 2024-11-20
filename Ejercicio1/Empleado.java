package Taller7.Ejercicio1;

public class Empleado {
    public String nombre; 

    private double salario; 

    // Constructor
    public Empleado(String nombre, double salarioInicial) {
        this.nombre = nombre;
        setSalario(salarioInicial);
    }

   
    public double getSalario() {
        return salario;
    }


    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("El salario no puede ser negativo. No se realizó el cambio.");
        }
    }

    
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
    }
}

