
/**
 * Modela un objeto del concepto hombre, permitiendo obtener datos y estado civil
 * 
 * @author GAUNA GASTON LEONEL - BARRIOS MARCOS 
 * @version (a version number or a date)
 */
public class Hombre {
    
    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Mujer esposa;

    
    /**
     * @param p_nomnre
     * @param p_apellido
     * @param p_edad
     */
    public Hombre(String p_nombre, String p_apellido, int p_edad) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltero");
        this.setEsposa(null);
    }

    /**
     * @param p_nomnre
     * @param p_apellido
     * @param p_edad
     * @param p_esposa tipo objeto de la clase Mujer
     */
    public Hombre(String p_nombre, String p_apellido, int p_edad, Mujer p_esposa) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Casado");
        this.setEsposa(p_esposa);
    }

    //accessors
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }

    public String getApellido() {
        return this.apellido;
    }

    private void setEdad(int p_edad) {
        this.edad = p_edad;
    }

    public int getEdad() {
        return this.edad;
    }

    private void setEstadoCivil(String p_estadoCivil) {
        this.estadoCivil = p_estadoCivil;
    }

    public String getEstadoCivil() {
        return this.estadoCivil;
    }

    private void setEsposa(Mujer p_esposa) {
        this.esposa = p_esposa;
    }

    public Mujer getEsposa() {
        return this.esposa;
    }

    /**
     * asigna el conyuge indicado al estado civil
     * @param p_mujer 
     */
    public void casarseCon(Mujer p_mujer) {
        this.setEsposa(p_mujer);
        this.setEstadoCivil("Casado");
    }
    
    /**
     *  coloca null en el atributo esposo/esposa
     */
    public void divorcio() {
        this.setEsposa(null);
        this.setEstadoCivil("Divorciado");
    }

    /**
     * @return un string con los datos del objeto hombre con los datos (nombre, apellido y edad)
     */
    public String datos() {
        return this.getNombre() + " " + this.getApellido() + " de " + this.getEdad() + " años";
    }

    /**
     * imprime el estado civil en pantalla
     */
    public void mostrarEstadoCivil() {
        System.out.println(this.datos() + " - " + this.getEstadoCivil());
    }

    /**
     *  imprime por pantalla el nombre de la persona con quien esta casado
     */
    public void casadoCon() {
        if (this.getEsposa() != null) {
            System.out.println(this.datos() + " está casado con " + this.getEsposa().datos());
        } else {
            System.out.println(this.datos() + " no está casado.");
        }
    }
}