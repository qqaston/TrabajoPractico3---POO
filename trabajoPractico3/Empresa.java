import java.util.Calendar;
import java.util.GregorianCalendar;

public class Empresa {

    public static void main(String[] args) {
        
        System.out.println("==========================================");
        System.out.println("   PUNTO 11: PRUEBA DE EMPLEADO SIMPLE    ");
        System.out.println("==========================================");
        
        // Seteamos la fecha de hoy para forzar el aniversario
        Calendar fechaHoy = new GregorianCalendar();
        Empleado empleadoSimple = new Empleado(20443863568L, "Gauna", "Gaston", 500000.0, fechaHoy);
        
        empleadoSimple.mostrar();
        
        if (empleadoSimple.esAniversario()) {
            System.out.println("\n*** PERMISO DE SALIDA (PUNTO 11) ***");
            System.out.println("El empleado " + empleadoSimple.nomYApe() + " puede retirarse 1 hora antes.");
        }


        System.out.println("\n==========================================");
        System.out.println("   PUNTO 12: PRUEBA DE EMPLEADO CON JEFE  ");
        System.out.println("==========================================");
        
        // 1. Instanciamos al Gerente (sin jefe)
        Calendar fechaGerente = new GregorianCalendar(2015, Calendar.MARCH, 10);
        EmpleadoConJefe gerente = new EmpleadoConJefe(20112223334L, "Perez", "Juan", 900000.0, fechaGerente);
        
        // 2. Instanciamos al empleado subordinado (usamos la fecha de hoy para el aniversario)
        EmpleadoConJefe empleadoSubordinado = new EmpleadoConJefe(20443863568L, "Gauna", "Gaston", 500000.0, fechaHoy, gerente);
        
        empleadoSubordinado.mostrarPantalla();
        
        // 3. Verificamos el aniversario y emitimos el permiso firmado
        if (empleadoSubordinado.esAniversario()) {
            System.out.println("\n*** PERMISO DE SALIDA (PUNTO 12) ***");
            System.out.println("Se autoriza al empleado " + empleadoSubordinado.nomYape() + " a retirarse");
            System.out.println("1 hora más temprano por aniversario de ingreso.");
            
            if (empleadoSubordinado.getJefe() != null) {
                System.out.println("Firma autorizada por su jefe: " + empleadoSubordinado.getJefe().nomYape());
            } else {
                System.out.println("Firma autorizada por: GERENCIA GENERAL");
            }
        }
    }
}