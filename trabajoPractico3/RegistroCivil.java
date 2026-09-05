
/**
 * Write a description of class RegistroCivil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RegistroCivil {

    public static void main(String[] args) {
        
        // 1. Instanciamos un hombre y una mujer (ambos solteros inicialmente)
        Mujer maria = new Mujer("María", "Gómez", 28);
        Hombre pedro = new Hombre("Pedro", "Leyes", 29);
        
        System.out.println("--- ESTADO INICIAL ---");
        maria.mostrarEstadoCivil();
        pedro.mostrarEstadoCivil();
        
        // 2. Se efectúa el matrimonio cruzado (ambos se conocen entre sí)
        maria.casarseCon(pedro);
        pedro.casarseCon(maria);
        
        // 3. Emisión del certificado de matrimonio
        System.out.println("\n==========================================");
        System.out.println("       CERTIFICADO DE MATRIMONIO");
        System.out.println("==========================================");
        pedro.casadoCon();
        maria.casadaCon();
        
        // 4. Simulamos un divorcio posterior para verificar los métodos
        System.out.println("\n--- TRAMITE DE DIVORCIO ---");
        maria.divorcio();
        pedro.divorcio();
        
        maria.mostrarEstadoCivil();
        pedro.mostrarEstadoCivil();
    }
}