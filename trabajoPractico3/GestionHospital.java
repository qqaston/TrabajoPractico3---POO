
/**
 * Write a description of class GestionHospital here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GestionHospital {

    public static void main(String[] args) {
        
        // 1. Instanciamos las localidades
        // El PDF usa "Monte Caseros", "Corrientes" para donde vive. Usamos lo mismo para donde nació a modo de ejemplo.
        Localidad localidadNacido = new Localidad("Monte Caseros", "Corrientes");
        Localidad localidadVive = new Localidad("Monte Caseros", "Corrientes");
        
        // 2. Instanciamos el paciente pasando las localidades creadas
        Paciente paciente = new Paciente(578669, "Juan Manuel Ortigoza", "Bulevar 3 de Abril", localidadNacido, localidadVive);
        
        // 3. Instanciamos el hospital
        Hospital hospital = new Hospital("Garrahan", "Leonardo Ruiz");
        
        // ==========================================
        // PRUEBAS DE MÉTODOS
        // ==========================================
        System.out.println("--- 1. Prueba de mostrarDatosPantalla() desde Paciente ---");
        paciente.mostrarDatosPantalla();
        
        System.out.println("\n--- 2. Prueba de cadenaDeDatos() desde Paciente ---");
        System.out.println(paciente.cadenaDeDatos());
        
        System.out.println("\n--- 3. Prueba de consultaDatosFiliatorios() desde Hospital ---");
        hospital.consultaDatosFiliatorios(paciente);
    }
}