
/**
 * Write a description of class CajaDeAhorro here.
 * 
 * @author GAUNA GASTON LEONEL
 * @version 3/9/26
 */
public class CajaDeAhorro
{
    private int nroCuenta;
    private Persona titular;
    private double saldo;
    private int extraccionesPosibles;

    /**
     * Constructor for objects of class CajaDeAhorro
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0);
        this.setExtraccionesPosibles(10);
    }
    
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
        this.setExtraccionesPosibles(10);
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
    
    private void setExtraccionesPosibles(int p_extraPos){
        this.extraccionesPosibles = p_extraPos;
    }
    
    public int getExtraccionesPosibles(){
        return this.extraccionesPosibles;
    }
    
    /**
     *
     */
    
    public void depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
    }
    
    /**
     * 
     */
    private boolean puedoExtraer(double p_importe){
        if (p_importe <= this.getSaldo() && this.getExtraccionesPosibles() > 0){
            return true;
        }else {
            return false;
        }
    }
    
    /**
     *  
     */
    private void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
        this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
    }
    

    public void extraer(double p_importe){
        if(this.puedoExtraer(p_importe)){
            this.extraccion(p_importe);
            System.out.println("*** EXTRACCION EXISTOSA ***");
        }else if(this.getExtraccionesPosibles() <= 0){
            System.out.println("*** No tiene habilitadas mas extracciones! ***");
        }else{
            System.out.println("*** No puede extraer mas que el saldo! ***");
        }
    }
    
       
    public void mostrar(){
        System.out.println("- CAJA DE AHORRO -");
        System.out.println("Nro Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
        System.out.println("Extracciones Disponibles: " + this.getExtraccionesPosibles());
    }  
}