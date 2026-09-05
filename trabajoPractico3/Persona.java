/**
 * Write a description of class crearAlumno here.
 * 
 * @author GAUNA GASTON LEONEL 44.386.356
 * @version 5/9/26
 */
import java.util.*;


public class Persona {
    
    //atributos
    private int nroDni;
    private String nombre;
    private String apellido;
    private Calendar fechaNacimiento; //reemplazado (int anioNacimiento;);
    
    //metodo constructor
    public Persona(int p_dni, String p_nombre, String p_apellido,int p_anio){
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setAnioNacimiento(p_anio);
    }
    
    public Persona(int p_dni, String p_nombre, String p_apellido,Calendar p_fecha){
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setFechaNacimiento(p_fecha);
    }
    
    //accossers
    private void setDNI(int p_dni){
        this.nroDni = p_dni;
    }
    
    public int getDNI(){
        return this.nroDni;
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    /**
     * se crea una variable miFecha en el constructor con el año de nacimiento
     */
    private void setAnioNacimiento(int p_anio){
        Calendar miFecha = Calendar.getInstance();
        miFecha.set(Calendar.YEAR, p_anio);
        this.setFechaNacimiento(miFecha);
    }
    
    public int getAnioNacimiento(){
        Calendar fecha = this.getFechaNacimiento();
        int anio = fecha.get(Calendar.YEAR);
        return anio;
    }
    
    private void setFechaNacimiento(Calendar p_fecha){
        this.fechaNacimiento = p_fecha;
    }
    
    public Calendar getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    
    //metodo para calcular la edad de la persona
    public int edad(){
        Calendar fechaHoy = new GregorianCalendar();
        return fechaHoy.get(Calendar.YEAR) - this.getAnioNacimiento();
    }
    
    public boolean esCumpleanos(){
        Calendar fechaHoy = Calendar.getInstance();
        if(fechaHoy.get(Calendar.MONTH) == this.fechaNacimiento.get(Calendar.MONTH) && 
           fechaHoy.get(Calendar.DAY_OF_MONTH) == this.fechaNacimiento.get(Calendar.DAY_OF_MONTH)){
            return true;
        } else {
            return false;
        }
    }
    
    public String nomYApe(){
        return this.nombre + " " + this.apellido;
    }
    
    public String apeYNom(){
        return this.apellido + " " + this.nombre;
    }
    
    //metodo que imprime por pantalla la informacion del objeto instanciado
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + this.nomYApe());
        System.out.println("DNI: " + this.getDNI() + "   Edad: " + this.edad());
        
    }

}