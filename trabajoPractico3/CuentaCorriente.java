
/**
 * Write a description of class CuentaCorriente here.
 * 
 * @author GAUNA GASTON LEONEL
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
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0);
        this.setLimiteDescubierto(500);
    }
    
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
        this.setLimiteDescubierto(500);
    }

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
     */
    
    public void depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
    }
    
    /**
     * El método puedeExtraer(p_importe) devuelve true si el importe a retirar no supera el saldo más el límite de descubierto autorizado. 
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
     * La salida impresa del método mostrar() debe ser la siguiente: (los valores en negrita dependen del estado interno del objeto)
     */
    
    public void mostrar(){
        System.out.println("- CUENTA CORRIENTE -");
        System.out.println("Nro Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
        System.out.println("Descubierto: " + this.getLimiteDescubierto());
    }  
}
