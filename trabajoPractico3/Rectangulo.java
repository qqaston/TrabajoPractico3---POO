
/**
 * Write a description of class Rectangulo here.
 * 
 * @author GAUNA GASTON LEONEL
 * @version 1/9/26
 */
public class Rectangulo
{
    // instance variables
    private Punto origen;
    private double ancho;
    private double alto;

    /**
     * Constructor for objects of class Rectangulo
     * @param p_origne
     * @param p_ancho
     * @param p_alto
     */
    public Rectangulo(Punto p_origen, double p_ancho, double p_alto){
        this.setOrigen(p_origen);
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }
    
    
    /**
     * @param p_ancho
     * @param p_alto
     */
    public Rectangulo(double p_ancho, double p_alto){
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
        
        this.setOrigen(new Punto(0,0));
    }

    private void setOrigen(Punto p_origen){
        this.origen = p_origen;
    }
    
    public Punto getOrigen(){
        return this.origen;
    }
    
    private void setAncho(double p_ancho){
        this.ancho = p_ancho;
    }
    
    public double getAncho(){
        return this.ancho;
    }
    
    private void setAlto(double p_alto){
        this.alto = p_alto;
    }
    
    public double getAlto(){
        return this.alto;
    }
    
    /**
     * Desplaza el rectangulo, trasladando su origen a otra posicion, sin cambiar sus dimensiones
     * @param p_dx
     * @param p_dy
     */
    public void desplazar(double p_dx, double p_dy){
        this.origen.desplazar(p_dx, p_dy);
    }
    
    /**
     * Imprime por pantalla las caracteristicas del rectangulo
     */
    public void caracteristicas(){
        System.out.println("==========RECTANGULO==========");
        System.out.println("Origen: " + this.origen.coordenadas() + " - Alto: " + this.getAlto() + "- Ancho: " + this.getAncho());
        System.out.println("Superficie: " + this.superficie() + " - Perimetro: " + this.perimetro());
    }
    
    /**
     * @return el permietro del rectangulo 
     */
    public double perimetro(){
        return 2 * this.getAlto() + 2 * this.getAncho();
    }
    
    /**
     * @return la superficie del rectangulo
     */
    public double superficie(){
        return this.getAlto() * this.getAncho();
    }
    
    /**
     * @return la distancia que hay entre dos rectangulo desde su origen
     */
    public double distanciaA(Rectangulo otroRectangulo){
        return this.origen.distanciaA(otroRectangulo.getOrigen());
    }
    
    /**
     * @return el ractangulo mayor entre dos rectangulos, en base a su superficie
     */
    public Rectangulo elMayor(Rectangulo otroRectangulo){
        if(this.superficie() > otroRectangulo.superficie()){
            return this; 
        }else{
            return otroRectangulo;
        }
    }
}