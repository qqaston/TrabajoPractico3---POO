import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Clase que modela un empleado que conoce a su jefe.
 *
 * @author GAUNA GASTON LEONEL
 * @version 1.0
 */
public class EmpleadoConJefe {

    // Atributos

    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso;
    private EmpleadoConJefe jefe;

    // Constructor con jefe y fecha

    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre,
                           double p_importe, Calendar p_fecha,
                           EmpleadoConJefe p_jefe) {

        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
        this.setJefe(p_jefe);
    }

    // Constructor sin jefe y fecha
    // Se utiliza para el Gerente General.

    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre,
                           double p_importe, Calendar p_fecha) {

        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
        this.setJefe(null);
    }

    // Constructor antiguo con año y jefe

    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre,
                           double p_importe, int p_anio,
                           EmpleadoConJefe p_jefe) {

        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anio);
        this.setJefe(p_jefe);
    }

    // Constructor antiguo con año sin jefe

    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre,
                           double p_importe, int p_anio) {

        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anio);
        this.setJefe(null);
    }

    // CUIL

    private void setCuil(long p_cuil) {
        this.cuil = p_cuil;
    }

    public long getCuil() {
        return this.cuil;
    }

    // Nombre

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    // Apellido

    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }

    public String getApellido() {
        return this.apellido;
    }

    // Sueldo

    private void setSueldoBasico(double p_importe) {
        this.sueldoBasico = p_importe;
    }

    public double getSueldoBasico() {
        return this.sueldoBasico;
    }

    // Fecha de ingreso

    private void setFechaIngreso(Calendar p_fecha) {
        this.fechaIngreso = p_fecha;
    }

    public Calendar getFechaIngreso() {
        return this.fechaIngreso;
    }

    // Protocolo antiguo basado en int

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

    // Jefe

    private void setJefe(EmpleadoConJefe p_jefe) {
        this.jefe = p_jefe;
    }

    public EmpleadoConJefe getJefe() {
        return this.jefe;
    }

    // Antigüedad

    public int antiguedad() {
        Calendar fechaHoy = new GregorianCalendar();

        int anioHoy = fechaHoy.get(Calendar.YEAR);
        int anioIngreso = this.getFechaIngreso().get(Calendar.YEAR);

        int antiguedad = anioHoy - anioIngreso;

        if (fechaHoy.get(Calendar.MONTH) < this.getFechaIngreso().get(Calendar.MONTH)) {
            antiguedad--;
        } else if (fechaHoy.get(Calendar.MONTH) == this.getFechaIngreso().get(Calendar.MONTH)
                && fechaHoy.get(Calendar.DAY_OF_MONTH)
                < this.getFechaIngreso().get(Calendar.DAY_OF_MONTH)) {
            antiguedad--;
        }

        return antiguedad;
    }

    // Descuento

    private double descuento() {
        return (this.getSueldoBasico() * 2 / 100) + 1500;
    }

    // Adicional

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

    // Sueldo neto

    public double sueldoNeto() {
        return this.getSueldoBasico()
                + this.adicional()
                - this.descuento();
    }

    // Nombre y apellido

    public String nomYape() {
        return this.getNombre() + " " + this.getApellido();
    }

    public String apeYnom() {
        return this.getApellido() + ", " + this.getNombre();
    }

    // Mostrar datos incluyendo jefe

    public void mostrar() {

        System.out.println("Nombre y Apellido: " + this.nomYape());
        System.out.println("CUIL: " + this.getCuil()
                + " Antigüedad: " + this.antiguedad()
                + " años de servicio");
        System.out.println("Sueldo Neto: $ " + this.sueldoNeto());

        if (this.getJefe() != null) {
            System.out.println("Responde a: " + this.getJefe().apeYnom());
        } else {
            System.out.println("Responde a: GERENTE GENERAL");
        }
    }

    // Alias según el nombre utilizado en el UML

    public void mostrarPantalla() {
        this.mostrar();
    }

    // Mostrar en una línea

    public String mostrarLinea() {
        return this.getCuil()
                + "\t"
                + this.apeYnom()
                + "\t$"
                + this.sueldoNeto();
    }

    // Determina si hoy es aniversario

    public boolean esAniversario() {
        Calendar fechaHoy = new GregorianCalendar();

        return fechaHoy.get(Calendar.MONTH)
                == this.getFechaIngreso().get(Calendar.MONTH)
                && fechaHoy.get(Calendar.DAY_OF_MONTH)
                == this.getFechaIngreso().get(Calendar.DAY_OF_MONTH);
    }
}
