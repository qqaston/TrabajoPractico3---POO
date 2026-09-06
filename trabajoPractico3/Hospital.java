
/**
 * Clase hospital modela el hospital e imprime los datos del mismo
 * 
 * @author GAUNA GASTON LEONEL - BARRIOS MARCOS 
 * @version 6/9/26
 */
public class Hospital {
    
    private String nombreHospital;
    private String nombreDirector;

    /**
     * @param p_nombreHospital
     * @param p_nombreDirector
     */
    public Hospital(String p_nombreHospital, String p_nombreDirector) {
        this.setNombreHospital(p_nombreHospital);
        this.setNombreDirector(p_nombreDirector);
    }

    /**
     * @param p_nombreHospital
     */
    private void setNombreHospital(String p_nombreHospital) {
        this.nombreHospital = p_nombreHospital;
    }

    public String getNombreHospital() {
        return this.nombreHospital;
    }

    private void setNombreDirector(String p_nombreDirector) {
        this.nombreDirector = p_nombreDirector;
    }

    public String getNombreDirector() {
        return this.nombreDirector;
    }
    
    
    /**
     * El método consultaDatosFiliatorios() tiene una salida con el siguiente formato
     */
    public void consultaDatosFiliatorios(Paciente p_paciente){
        System.out.println("Hospital: " + this.getNombreHospital() + "   Director: " + this.getNombreDirector());
        System.out.println("--------------------------------------------------------------------");
        p_paciente.mostrarDatosPantalla();
    }
}