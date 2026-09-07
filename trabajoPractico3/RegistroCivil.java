
/**
 * Clase ejecutable de RegistroCivil, utiliza los objeto de clase Hombre y Mujer para hacer pruebas 
 * 
 * @author GAUNA GASTON LEONEL - BARRIOS MARCOS
 * @version (a version number or a date)
 */
public class RegistroCivil {

    public static void main(String[] args) {
        
        //instancia Hombre y Mujer, solteros
        Mujer maria = new Mujer("Maria", "Gomez", 28);
        Hombre pedro = new Hombre("Pedro", "Leyes", 29);
        
        System.out.println("*****ESTADO INICIAL*****");
        maria.mostrarEstadoCivil();
        pedro.mostrarEstadoCivil();
        
        //casamiento
        maria.casarseCon(pedro);
        pedro.casarseCon(maria);
        
        //imprime el certificado
        System.out.println("*****CERTIFICADO DE MATRIMONIO*****");
        System.out.println("==========================================");
        pedro.casadoCon();
        maria.casadaCon();
        
        //imprime el divorcio
        System.out.println("*****TRAMITE DE DIVORCIO*****");
        maria.divorcio();
        pedro.divorcio();
        
        maria.mostrarEstadoCivil();
        pedro.mostrarEstadoCivil();
    }
}