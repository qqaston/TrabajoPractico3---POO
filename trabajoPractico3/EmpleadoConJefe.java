import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Clase que modela un empleado que conoce a su jefe inmediato, permitiendo 
 * gestionar jerarquias, antiguedad y liquidación de sueldos
 *
 * @author GAUNA GASTON LEONEL - BARRIOS MARCOS
 * @version
 */
public class EmpleadoConJefe {

    // Atributos
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso;
    private EmpleadoConJefe jefe;

    /**
     * Constructor para un empleado con fecha exacta y asignacion de jefe
     * 
     * @param p_cuil     
     * @param p_apellido 
     * @param p_nombre   
     * @param p_importe  
     * @param p_fecha   
     * @param p_jefe     
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha, EmpleadoConJefe p_jefe) {
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
        this.setJefe(p_jefe);
    }

    /**
     * Constructor para un empleado sin jefe 
     * 
     * @param p_cuil     
     * @param p_apellido 
     * @param p_nombre   
     * @param p_importe  
     * @param p_fecha    
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha) {
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
        this.setJefe(null);
    }

    /**
     * Constructor para un empleado con jefe, utilizando solo el año
     * 
     * @param p_cuil     
     * @param p_apellido 
     * @param p_nombre   
     * @param p_importe  
     * @param p_anio     
     * @param p_jefe     
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio, EmpleadoConJefe p_jefe) {
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anio);
        this.setJefe(p_jefe);
    }

    /**
     * Constructor para un empleado sin jefe, utilizando solo el año
     * 
     * @param p_cuil     El número de CUIL del empleado.
     * @param p_apellido El apellido del empleado.
     * @param p_nombre   El nombre del empleado.
     * @param p_importe  El sueldo básico asignado.
     * @param p_anio     El año de ingreso a la empresa.
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio) {
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anio);
        this.setJefe(null);
    }

    //accessors 
    private void setCuil(long p_cuil) {
        this.cuil = p_cuil;
    }

    public long getCuil() {
        return this.cuil;
    }

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

    private void setSueldoBasico(double p_importe) {
        this.sueldoBasico = p_importe;
    }

    public double getSueldoBasico() {
        return this.sueldoBasico;
    }

    private void setFechaIngreso(Calendar p_fecha) {
        this.fechaIngreso = p_fecha;
    }

    public Calendar getFechaIngreso() {
        return this.fechaIngreso;
    }

    private void setAnioIngreso(int p_anio) {
        Calendar fecha = new GregorianCalendar();
        fecha.set(Calendar.YEAR, p_anio);
        fecha.set(Calendar.MONTH, Calendar.JANUARY);
        fecha.set(Calendar.DAY_OF_MONTH, 1);
        this.setFechaIngreso(fecha);
    }

    public int getAnioIngreso() {
        return this.getFechaIngreso().get(Calendar.YEAR);
    }

    private void setJefe(EmpleadoConJefe p_jefe) {
        this.jefe = p_jefe;
    }

    public EmpleadoConJefe getJefe() {
        return this.jefe;
    }

    /**
     * Calcula los años completos de servicio del empleado en la empresa.
     * 
     * @return La cantidad de años de antigüedad.
     */
    public int antiguedad() {
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        int anioIngreso = this.getFechaIngreso().get(Calendar.YEAR);
        int antiguedad = anioHoy - anioIngreso;

        if (fechaHoy.get(Calendar.MONTH) < this.getFechaIngreso().get(Calendar.MONTH)) {
            antiguedad--;
        } else if (fechaHoy.get(Calendar.MONTH) == this.getFechaIngreso().get(Calendar.MONTH)
                && fechaHoy.get(Calendar.DAY_OF_MONTH) < this.getFechaIngreso().get(Calendar.DAY_OF_MONTH)) {
            antiguedad--;
        }
        return antiguedad;
    }

    /**
     * Calcula los descuentos fijos aplicados al sueldo del empleado.
     * 
     * @return El monto total a descontar.
     */
    private double descuento() {
        return (this.getSueldoBasico() * 2 / 100) + 1500;
    }

    /**
     * Calcula el monto adicional correspondiente según los años de antigüedad.
     * 
     * @return El dinero extra a sumar al sueldo básico.
     */
    private double adicional() {
        int anios = this.antiguedad();
        if (anios < 2) {
            return this.getSueldoBasico() * 0.02;
        } else if (anios >= 2 && anios < 10) {
            return this.getSueldoBasico() * 0.04;
        } else {
            return this.getSueldoBasico() * 0.06;
        }
    }

    /**
     * Calcula el salario final del empleado luego de sumar adicionales y restar descuentos
     * 
     * @return El sueldo neto a cobrar
     */
    public double sueldoNeto() {
        return this.getSueldoBasico() + this.adicional() - this.descuento();
    }

    /**
     * @return Un String concatenando el nombre y el apellido
     */
    public String nomYape() {
        return this.getNombre() + " " + this.getApellido();
    }

    /**
     * @return Un String concatenando el apellido y el nombre separados por coma
     */
    public String apeYnom() {
        return this.getApellido() + ", " + this.getNombre();
    }

    /**
     * Imprime por pantalla la informacion detallada del empleado, 
     * informando ademas quién es su jefe directo
     */
    public void mostrar() {
        System.out.println("Nombre y Apellido: " + this.nomYape());
        System.out.println("CUIL: " + this.getCuil() + " Antigüedad: " + this.antiguedad() + " años de servicio");
        System.out.println("Sueldo Neto: $ " + this.sueldoNeto());

        if (this.getJefe() != null) {
            System.out.println("Responde a: " + this.getJefe().apeYnom());
        } else {
            System.out.println("Responde a: GERENTE GENERAL");
        }
    }

    /**
     * Alias del metodo mostrar según lo definido en el modelo UML.
     */
    public void mostrarPantalla() {
        this.mostrar();
    }

    /**
     * @return Los datos resumidos del empleado tabulados en una sola linea de texto.
     */
    public String mostrarLinea() {
        return this.getCuil() + "\t" + this.apeYnom() + "\t$" + this.sueldoNeto();
    }

    /**
     * Verifica si la fecha actual coincide en día y mes con la fecha de ingreso
     * 
     * @return true si es el aniversario del empleado, false en caso contrario
     */
    public boolean esAniversario() {
        Calendar fechaHoy = new GregorianCalendar();
        return fechaHoy.get(Calendar.MONTH) == this.getFechaIngreso().get(Calendar.MONTH)
                && fechaHoy.get(Calendar.DAY_OF_MONTH) == this.getFechaIngreso().get(Calendar.DAY_OF_MONTH);
    }
}