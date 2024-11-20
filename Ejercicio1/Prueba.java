package Taller7.Ejercicio1;

public class Prueba {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Carlos", 3000);
        
        
        System.out.println("Información del empleado 1:");
        empleado1.mostrarInformacion();

        
        empleado1.nombre = "Ana";
        System.out.println("Información después de cambiar el nombre:");
        empleado1.mostrarInformacion();

       
        System.out.println("Intentando establecer un salario negativo:");
        empleado1.setSalario(-5000);
        empleado1.mostrarInformacion();

       
        System.out.println("Estableciendo un nuevo salario válido:");
        empleado1.setSalario(4500);
        empleado1.mostrarInformacion();
    }
}
