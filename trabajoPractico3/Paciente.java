
/**
 * Clase que modela un paciente permitiendo obtener sus datos
 * 
 * @author GAUNA GASTON LEONEL - BARRIOS MARCOS  
 * @version (a version number or a date)
 */
public class Paciente {
    
    private int historiaClinica;
    private String nombre;
    private String domicilio;
    private Localidad localidadNacido;
    private Localidad localidadVive;

    /**
     * metodo contructor
     * 
     * @param p_historia
     * @param p_nombre
     * @param p_domicilio
     * @param p_localidadNacido
     * @param p_localidadVive
     */
    public Paciente(int p_historia, String p_nombre, String p_domicilio, Localidad p_localidadNacido, Localidad p_localidadVive) {
        this.setHistoriaClinica(p_historia);
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setNacido(p_localidadNacido);
        this.setVive(p_localidadVive);
    }

    private void setHistoriaClinica(int p_historia) {
        this.historiaClinica = p_historia;
    }

    public int getHistoriaClinica() {
        return this.historiaClinica;
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    private void setDomicilio(String p_domicilio) {
        this.domicilio = p_domicilio;
    }

    public String getDomicilio() {
        return this.domicilio;
    }

    private void setNacido(Localidad p_nacido) {
        this.localidadNacido = p_nacido;
    }

    public Localidad getNacido() {
        return this.localidadNacido;
    }

    private void setVive(Localidad p_vive) {
        this.localidadVive = p_vive;
    }

    public Localidad getVive() {
        return this.localidadVive;
    }
    
    /**
     * El método mostrarDatosPantalla(), muestra al operador la información requerida con el siguiente formato:
     */
    
    public void mostrarDatosPantalla(){
        System.out.println("Paciente: " + this.getNombre() + 
                        "   Historia Clinica: " + this.getHistoriaClinica() +
                        "   Domicilio: " + this.getDomicilio());
        System.out.println(this.getVive().mostrar());                        
    }
    
    /**
     * El método cadenaDeDatos() retorna un String con los mismos datos, pero con el siguiente formato
     * Juan Manuel Ortigoza …… 57869 ..… Bulevar 3 de Abril - Monte Caseros – Corrientes
     */
    public String cadenaDeDatos(){
        return this.getNombre() + "....." + this.getHistoriaClinica() + "......" + this.getDomicilio() + " - " + this.getVive().getNombre() + " - " + this.getVive().getProvincia();
    }
}