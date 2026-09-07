import java.util.Calendar;
import java.util.GregorianCalendar;

public class Empresa {

    public static void main(String[] args) {
        
        System.out.println("*****PUNTO 11: PRUEBA DE EMPLEADO SIMPLE*****");
        System.out.println("==========================================");
        
        // Seteamos la fecha de hoy para forzar el aniversario
        Calendar fechaHoy = new GregorianCalendar();
        Empleado empleadoSimple = new Empleado(13485774687L, "GONZALES", "ROBERTO", 500000.0, fechaHoy);
        
        empleadoSimple.mostrar();
        
        if (empleadoSimple.esAniversario()) {
            System.out.println("****PERMISO DE SALIDA*****");
            System.out.println("El empleado " + empleadoSimple.nomYApe() + " puede retirarse 1 hora antes.");
        }


        System.out.println("*****PUNTO 12: PRUEBA DE EMPLEADO CON JEFE*****");
        System.out.println("==========================================");
        
        //Instanciamos al Gerente sin jefe
        Calendar fechaGerente = new GregorianCalendar(2015, Calendar.MARCH, 10);
        EmpleadoConJefe gerente = new EmpleadoConJefe(20112223334L, "Perez", "Juan", 900000.0, fechaGerente);
        
        //Instanciamos al empleado
        EmpleadoConJefe empleadoSubordinado = new EmpleadoConJefe(12879465178L, "GARCIA", "ROBERTO", 600000.0, fechaHoy, gerente);
        
        empleadoSubordinado.mostrarPantalla();
        
        //Verificamos el aniversario y emitimos el permiso firmado
        if (empleadoSubordinado.esAniversario()) {
            System.out.println("*****PERMISO DE SALIDA*****");
            System.out.println("Se autoriza al empleado " + empleadoSubordinado.nomYape() + " a retirarse");
            System.out.println("1 hora mAs temprano por aniversario de ingreso.");
            
            if (empleadoSubordinado.getJefe() != null) {
                System.out.println("Firma autorizada por su jefe: " + empleadoSubordinado.getJefe().nomYape());
            } else {
                System.out.println("Firma autorizada por: GERENCIA GENERAL");
            }
        }
    }
}