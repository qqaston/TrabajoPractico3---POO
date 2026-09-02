/**
 * Esta Clase Ciruculo aksdkaskdasdmasd
 * 
 * @author GAUNA GASTON LEONEL 
 * @version 31/8/26
 */
public class Circulo
{
    private double radio;
    private Punto centro;

    /**
     * Constructor for objects of class Circulo
     * @param p_radio
     * @param p_centro
     */
    public Circulo(double p_radio, Punto p_centro)
    {
        this.setRadio(p_radio);
        this.setCentro(p_centro);
    }
    
    public Circulo(){
        this.setRadio(0);
        this.setCentro(new Punto(0,0));
    
    }

    private void setRadio(double radio){
        this.radio = radio;
    }
    
    public double getRadio(){
        return this.radio;
    }
    
    private void setCentro(Punto centro){
        this.centro = centro;
    }
    
    public Punto getCentro(){
        return this.centro;
    }
    
    /**
     * Desplaza el criculo, desplazando su centro
     * @param p_dx
     * @param p_dy
     */
    public void desplazar(double p_dx, double p_dy){
        this.centro.desplazar(p_dx, p_dy);
    }
    
    /**
     * This class print to caracter circule
     */
    public void caracteristicas(){
        System.out.println("==========CIRCULO==========");
        System.out.println("Centro: " + this.centro.coordenadas() + " - Radio: " + this.getRadio());
        System.out.println("Superficie: " + this.superficie() + " - Perimetro: " + this.perimetro());
    }
    
    /**
     * @return el perimetro del circulo
     */
    public double perimetro(){
        return 2 * Math.PI * radio;
    }
    
    /**
     * @return el area del circulo
     */
    public double superficie(){
        return Math.PI * Math.pow(radio,2);
    }
    
    /**
     * @return la distancia entre dos circulos, desde su centro
     */
    public double distanciaA(Circulo otroCirculo){
        return this.centro.distanciaA(otroCirculo.getCentro());
    }
    
    /**
     * @return entre dos círculos, el mayor, en función del tamaño de su superficie.
     */
    public Circulo elMayor(Circulo otroCirculo){
        if(this.superficie() > otroCirculo.superficie()){
            return this; 
        }else{
            return otroCirculo;
        }
    }
}