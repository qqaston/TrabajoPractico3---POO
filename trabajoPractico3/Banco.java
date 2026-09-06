import java.util.GregorianCalendar;
/**
 * Clase ejecutable 
 * 
 * @author GAUNA GASTON LEONEL - BARRIOS MARCOS  
 * @version 6/9/26
 */
public class Banco {

    public static void main(String[] args) {
        
        Persona titular = new Persona(30827497, "Juan", "Perez", new GregorianCalendar(1999,8,5));
        
        CajaDeAhorro cajaAhorro = new CajaDeAhorro(101, titular, 3000.0);
        CuentaCorriente cuentaCorriente = new CuentaCorriente(202, titular, 2000.0);
        
        
        
        /**
         * CAJA DE AHORRO
         */
        System.out.println("*****PRUEBAS DE CAJA DE AHORRO*****");
        System.out.println("==========================================");
        cajaAhorro.mostrar();
        
        if (titular.esCumpleanos()) {
            System.out.println("¡Feliz cumpleaños " + titular.nomYApe() + "! Te desea el Banco.");
        }
        
        System.out.println("1- Extraccion exitosa ($1000):");
        cajaAhorro.extraer(1000);
        cajaAhorro.mostrar();
        
        System.out.println("2- Extraccion fallida por falta de saldo ($5000):");
        cajaAhorro.extraer(5000);
        
        System.out.println("3- Agotando las extracciones disponibles...");
        
        /**
         * funcion for para agotar las cantidades de extracciones
         */
        for (int i = 0; i < 9; i++) {
            cajaAhorro.extraer(10); 
        }
        cajaAhorro.mostrar();
        
        System.out.println("\n---> 4. Extraccion fallida por limite de operaciones ($100):");
        cajaAhorro.extraer(100); 


        
        /**
         * CUENTA CORRIENTE
         */

        System.out.println("*****PRUEBAS DE CUENTA CORRIENTE*****");
        System.out.println("==========================================");
        cuentaCorriente.mostrar();
        
        if (titular.esCumpleanos()) {
            System.out.println("¡Feliz cumpleaños " + titular.nomYApe() + "! Te desea el Banco.");
        }
        
        System.out.println("1- Extraccion exitosa usando solo saldo ($1500):");
        cuentaCorriente.extraer(1500);
        cuentaCorriente.mostrar();
        
        System.out.println("2- Extraccion exitosa usando descubierto ($800):");
        
        // El saldo actual es 500. Al sacar 800, el saldo debe quedar en 0 y el descubierto en 200
        cuentaCorriente.extraer(800);
        cuentaCorriente.mostrar();
        
        System.out.println("3- Extraccion fallida por superar el limite de descubierto ($500):");
        
        // Solo quedan 200 de descubierto disponible
        cuentaCorriente.extraer(500);
        
        System.out.println("4- Deposito para regularizar la cuenta ($1000):");
        cuentaCorriente.depositar(1000);
        cuentaCorriente.mostrar();
    }
}