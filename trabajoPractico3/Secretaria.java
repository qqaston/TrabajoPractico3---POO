
/**
 * Write a description of class Secretaria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Secretaria {

    public static void main(String[] args) {
        
        // 1. Instanciamos la escuela con los datos del ejemplo
        Escuela escuela = new Escuela("Manuel Belgrano", "Irigoyen 1580", "Leopoldo Juez");
        
        // 2. Instanciamos al docente
        // Asumiendo un constructor: Docente(String nombre, String grado, double sueldoBasico, double asignacionFamiliar)
        Docente docente = new Docente("Elisa Sánchez", "Tercer Grado", 1600.0, 1290.0);
        
        // 3. Emitimos el recibo llamando al método de la escuela y pasándole el objeto docente
        System.out.println("==========================================");
        System.out.println("           EMISIÓN DE RECIBO");
        System.out.println("==========================================\n");
        
        escuela.imprimirRecibo(docente);
    }
}