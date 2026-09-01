import java.util.Random;
/**
 * Write a description of class CreaFigura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class CreaFigura
{
    public static void main(String[] args){
        Random unNumero = new Random();
        double radio = unNumero.nextDouble() * 100.0;
        
        Circulo cir1 = new Circulo(radio,new Punto(0,0));
        
        cir1.desplazar(-240, -230);
        
        cir1.caracteristicas();
        
        Circulo cir2 = new Circulo(radio,new Punto(5.2,0.5));
        
        cir2.caracteristicas();
        
        System.out.println("Distancia entre cir1 y cir2: " + cir1.distanciaA(cir2));
        System.out.println("El ciruclo mayor es: " + cir1.elMayor(cir2));
        
    }
}