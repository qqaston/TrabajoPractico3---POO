
/**
 * MODELA EL CONCEPTO DE UNA CAJA DE AHORROS
 * 
 * @author GAUNA GASTON LEONEL - BARRIOS MARCOS
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
     * 
     * @param p_nroCuenta
     * @param p_titualar es un objeto de la clase Persona 
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0);
        this.setExtraccionesPosibles(10);
    }
    
    /**
     * @param p_nroCuenta
     * @param p_titualar es un objeto de la clase Persona 
     * @param p_saldo
     */
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
     * @param p_importe deposita saldo
     */
    
    public void depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
    }
    
    /**
     * @param p_importe
     * @return un booleano dependiendo de si puede tiene saldo y si tiene extracciones disponibles
     */
    private boolean puedoExtraer(double p_importe){
        if (p_importe <= this.getSaldo() && this.getExtraccionesPosibles() > 0){
            return true;
        }else {
            return false;
        }
    }
    
    /**
     * @param p_importe extrae el saldo y resta la cantidad de extraciones posibles
     */
    private void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
        this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
    }
    

    /**
     * @param p_importe calcula si se puede extraer saldo y utiliza los metodos extraccion() y extraccionesPosibles()
     */
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
    
    /**
     * imprime por pantalla los datos del titular y el saldo disponible 
     */ 
    public void mostrar(){
        System.out.println("- CAJA DE AHORRO -");
        System.out.println("Nro Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
        System.out.println("Extracciones Disponibles: " + this.getExtraccionesPosibles());
    }  
}