/**
 * Write a description of class crearAlumno here.
 * 
 * @author GAUNA GASTON LEONEL 44.386.356
 * @version (a version number or a date)
 */
import java.util.*;


public class Persona {
    
    //atributos
    private int nroDni;
    private String nombre;
    private String apellido;
    private int anioNacimiento;
    
    //metodo constructor
    public Persona(int p_dni, String p_nombre, String p_apellido, int p_anio){
        setDNI(p_dni);
        setNombre(p_nombre);
        setApellido(p_apellido);
        setAnioNacimiento(p_anio);
    }
    
    //accossers
    private void setDNI(int p_dni){
        nroDni = p_dni;
    }
    
    public int getDNI(){
        return nroDni;
    }
    
    private void setNombre(String p_nombre){
        nombre = p_nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    private void setApellido(String p_apellido){
        apellido = p_apellido;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    private void setAnioNacimiento(int p_anio){
        anioNacimiento = p_anio;
    }
    
    public int getAnioNacimiento(){
        return anioNacimiento;
    }
    
    //metodo para calcular la edad de la persona
    public int edad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        
        return anioHoy - anioNacimiento;
    }
    
    public String nomYApe(){
        return nombre + " " + apellido;
    }
    
    public String apeYNom(){
        return apellido + " " + nombre;
    }
    
    //metodo que imprime por pantalla la informacion del objeto instanciado
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + nomYApe());
        System.out.println("DNI: " + nroDni + "   Edad: " + edad());
        
    }

}