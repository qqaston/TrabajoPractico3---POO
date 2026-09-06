
/**
 * Clase GestionHospital cumple la funcion de ejecutable
 * 
 * @author GAUNA GASTON LEONEL - BARRIOS MARCOS
 * @version 5/9/26
 */
public class GestionHospital {

    public static void main(String[] args) {
        
        //se instanciam las localidades
        Localidad localidadNacido = new Localidad("Monte Caseros", "Corrientes");
        Localidad localidadVive = new Localidad("Monte Caseros", "Corrientes");
        
        //se innstancia el paciente pasando las localidades creadas
        Paciente paciente = new Paciente(578669, "Juan Manuel Ortigoza", "Bulevar 3 de Abril", localidadNacido, localidadVive);
        
        //instancia objeto hospital
        Hospital hospital = new Hospital("Garrahan", "Leonardo Ruiz");
        
        /**
         * Pruebas de los metodos de la Clase Paciente 
         */
        System.out.println("--- 1. Prueba de mostrarDatosPantalla() desde Paciente ---");
        paciente.mostrarDatosPantalla();
        
        System.out.println("--- 2. Prueba de cadenaDeDatos() desde Paciente ---");
        System.out.println(paciente.cadenaDeDatos());
        
        System.out.println("--- 3. Prueba de consultaDatosFiliatorios() desde Hospital ---");
        hospital.consultaDatosFiliatorios(paciente);
    }
}