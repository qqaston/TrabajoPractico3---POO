
/**
 * Write a description of class Docente here.
 * 
 * @author GAUNA GASTON LEONEL
 * @version 2/9/26
 */
public class Docente
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String grado;
    private double sueldoBasico;
    private double asignacionFamiliar;

    /**
     * Constructor for objects of class Docente
     */
    public Docente(String p_nombre, String p_grado, double p_sueldoBasico, double p_asigFamiliar){
        this.setNombre(p_nombre);
        this.setGrado(p_grado);
        this.setSueldoBasico(p_sueldoBasico);
        this.setAsigFam(p_asigFamiliar);
    }
    
     private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    private void setGrado(String p_grado){
        this.grado = p_grado;
    }
    
    public String getGrado(){
        return this.grado;
    }
    
    private void setSueldoBasico(double p_sueldoBasico){
        this.sueldoBasico = p_sueldoBasico;
    }
    
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    
    private void setAsigFam(double p_asigFamiliar){
        this.asignacionFamiliar = p_asigFamiliar;
    }
    
    public double getAsigFam(){
        return this.asignacionFamiliar;
    }

    public double calcularSueldo(){
        return this.getSueldoBasico() + this.getAsigFam();
    }
}