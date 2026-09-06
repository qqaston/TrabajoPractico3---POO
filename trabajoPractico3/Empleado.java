import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * Clase que modela un empleado para administrar su liquidacion de sueldo.
 *
 * @author GAUNA GASTON LEONEL
 * @version 5/9/26
 */
public class Empleado {

    // Atributos
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso;

    // Constructor anterior: mantiene el protocolo
    public Empleado(long p_cuil, String p_apellido, String p_nombre,
                    double p_importe, int p_anio) {

        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anio);
    }

    // Nuevo constructor
    public Empleado(long p_cuil, String p_apellido, String p_nombre,
                    double p_importe, Calendar p_fecha) {

        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
    }

    // Accessors de CUIL

    private void setCuil(long p_cuil) {
        this.cuil = p_cuil;
    }

    public long getCuil() {
        return this.cuil;
    }

    // Accessors de apellido

    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }

    public String getApellido() {
        return this.apellido;
    }

    // Accessors de nombre

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    // Accessors de sueldo

    private void setSueldoBasico(double p_importe) {
        this.sueldoBasico = p_importe;
    }

    public double getSueldoBasico() {
        return this.sueldoBasico;
    }

    // Accessors antiguos basados en int
    // Se mantienen para preservar el protocolo.

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

    // Nuevos accessors basados en Calendar

    private void setFechaIngreso(Calendar p_fecha) {
        this.fechaIngreso = p_fecha;
    }

    public Calendar getFechaIngreso() {
        return this.fechaIngreso;
    }

    // Antigüedad en años completos

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

    // Descuento aplicado al sueldo basico

    private double descuento() {
        return (this.getSueldoBasico() * 2 / 100) + 1500;
    }

    // Adicional por antigüedad

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

    public String nomYApe() {
        return this.getNombre() + " " + this.getApellido();
    }

    public String apeYNom() {
        return this.getApellido() + ", " + this.getNombre();
    }

    // Métodos con la nomenclatura del enunciado

    public String nomYape() {
        return this.getNombre() + " " + this.getApellido();
    }

    public String apeYnom() {
        return this.getApellido() + ", " + this.getNombre();
    }

    // Mostrar datos

    public void mostrar() {
        System.out.println("Nombre y Apellido: " + this.nomYApe());
        System.out.println("CUIL: " + this.getCuil()
                + " Antigüedad: " + this.antiguedad()
                + " años de servicio");
        System.out.println("Sueldo Neto: $ " + this.sueldoNeto());
    }

    // Mostrar en una línea

    public String mostrarLinea() {
        return this.getCuil()
                + "\t"
                + this.apeYNom()
                + "\t$"
                + this.sueldoNeto();
    }

    // Determina si hoy es el aniversario del ingreso

    public boolean esAniversario() {
        Calendar fechaHoy = new GregorianCalendar();

        return fechaHoy.get(Calendar.MONTH)
                == this.getFechaIngreso().get(Calendar.MONTH)
                && fechaHoy.get(Calendar.DAY_OF_MONTH)
                == this.getFechaIngreso().get(Calendar.DAY_OF_MONTH);
    }
}
