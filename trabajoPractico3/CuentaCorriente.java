
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
    }
    
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
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
    
    
}
