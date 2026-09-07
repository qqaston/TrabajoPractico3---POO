
/**
 * MODELA UN OBJETO DEL CONCEPTO MUJER
 * 
 * @author GAUNA GASTON LEONEL - BARRIOS MARCOS
 * @version (a version number or a date)
 */
public class Mujer {
    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Hombre esposo;

    
    /**
     * METODO CONSTRUCTOR
     * @param p_nombre
     * @param p_apellido 
     * @param p_edad
     */
    public Mujer(String p_nombre, String p_apellido, int p_edad) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltera");
        this.setEsposo(null);
    }

    /**
     * METODO CONSTRUCTOR
     * @param p_nombre
     * @param p_apellido 
     * @param p_edad
     * @param p_esposo del tipo objeto de la clase Hombre
     */
    public Mujer(String p_nombre, String p_apellido, int p_edad, Hombre p_esposo) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Casada");
        this.setEsposo(p_esposo);
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

    private void setEsposo(Hombre p_esposo) {
        this.esposo = p_esposo;
    }

    public Hombre getEsposo() {
        return this.esposo;
    }
    /**
     * asigna el conyuge indicado al estado civil
     * @param p_hombre
     */
    
    public void casarseCon(Hombre p_hombre) {
        this.setEsposo(p_hombre);
        this.setEstadoCivil("Casada");
    }

    /**
     *  coloca null en el atributo esposo/esposa
     */
    public void divorcio() {
        this.setEsposo(null);
        this.setEstadoCivil("Divorciada");
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
    public void casadaCon() {
        if (this.getEsposo() != null) {
            System.out.println(this.datos() + " está casada con " + this.getEsposo().datos());
        } else {
            System.out.println(this.datos() + " no está casada.");
        }
    }
}