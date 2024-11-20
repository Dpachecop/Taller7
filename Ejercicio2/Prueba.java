package Taller7.Ejercicio2;

public class Prueba {
    public static void main(String[] args) {
        
        CuentaBancaria cuenta = new CuentaBancaria("123456789", 5000, "Ahorros");

    
        System.out.println("Detalles de la cuenta:");
        cuenta.mostrarDetalles();

        System.out.println();

        // Intentar acceder directamente al número de cuenta (esto generará un error de compilación)
        // System.out.println("Número de Cuenta: " + cuenta.numeroCuenta); 'numeroCuenta' has private access

        // Acceso a la propiedad tipoCuenta, que es pública
        System.out.println("Tipo de Cuenta: " + cuenta.tipoCuenta);

        // Intentar modificar el saldo usando el método set con validación
        System.out.println("\nIntentando modificar el saldo:");
        cuenta.setSaldo(-1000); // esto rechaza el proceso
        cuenta.mostrarDetalles();
    }
}

/*EXPLICACION
 * En este ejercicio, se creo  la clase CuentaBancaria con una propiedad 
 * numeroCuenta privada para proteger la información sensible de la cuenta.
 *  También hemos creado métodos get y set para el atributo saldo,
 *  con validaciones para evitar cambios no deseados.
 *  La clase de prueba demuestra que el acceso a los atributos privados está restringido
*/
