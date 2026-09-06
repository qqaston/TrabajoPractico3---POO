
/**
 * Modela el concepto de una cuenta corriente 
 * 
 * @author GAUNA GASTON LEONEL - BARRIOS MARCOS
 * @version 3/9/26
 */
public class CuentaCorriente
{
    private int nroCuenta;
    private Persona titular;
    private double saldo;
    private double limiteDescubierto;
    
    /**
     * Constructor for objects of class CuentaCorriente
     * @param p_nroCuenta
     * @param p_titular que es un objeto de la clase Persona
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0);
        this.setLimiteDescubierto(500);
    }
    
    /**
     * Constructor for objects of class CuentaCorriente
     * @param p_nroCuenta
     * @param p_titular que es un objeto de la clase Persona
     * @param p_saldo
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
        this.setLimiteDescubierto(500);
    }

    //accossers
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    
    public Persona getTitular(){
        return this.titular;
    }
    
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    
    public double getSaldo(){
        return this.saldo;
    }

    private void setLimiteDescubierto(double p_limiteDescubierto){
        this.limiteDescubierto = p_limiteDescubierto;
    }
    
    public double getLimiteDescubierto(){
        return this.limiteDescubierto;
    }
    
    /**
     * El método depositar(p_importe) sólo agrega el importe al saldo actual.
     * @param p_importe
     */
    
    public void depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
    }
    
    /**
     * El método puedeExtraer(p_importe) devuelve true si el importe a retirar no supera el saldo más el límite de descubierto autorizado. 
     * @return un boolean
     */
    private boolean puedoExtraer(double p_importe){
        if (p_importe <= (this.getLimiteDescubierto() + this.getSaldo())){
            return true;
        }else {
            return false;
        }
    }
    
    /**
     * El método extraccion(p_importe) es el que realiza efectivamente la extracción.
     * @param p_importe
     */
    private void extraccion(double p_importe){
        if (p_importe <= this.getSaldo()){
            this.setSaldo(this.getSaldo() - p_importe);
        }else{
            double resto = p_importe - this.getSaldo(); 
            this.setSaldo(0); // El saldo se agota
            this.setLimiteDescubierto(this.getLimiteDescubierto() - resto);
        }
    }
    
    /**
     * El método extraer(p_importe) coordina la operación, de acuerdo a si se cumplen las condiciones de extracción, caso contrario
     * informará el motivo por el cual no se pudo extraer.
     * @param p_importe
     */
    
    public void extraer(double p_importe){
        if(this.puedoExtraer(p_importe)){
            this.extraccion(p_importe);
            System.out.println("*** EXTRACCION EXISTOSA ***");
        }else{
            System.out.println("*** El importe de extraccion sobrepasa el límite de descubierto! ***");
        }
    }
    
    /**
     * Imprime los datos del titular y el saldo disponible
     */
    
    public void mostrar(){
        System.out.println("- CUENTA CORRIENTE -");
        System.out.println("Nro Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
        System.out.println("Descubierto: " + this.getLimiteDescubierto());
    }  
}
