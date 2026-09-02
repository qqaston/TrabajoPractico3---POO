import java.util.Random;
/**
 * Write a description of class CreaFigura here.
 * 
 * @author GAUNA GASTON LEONEL
 * @version 31/8/2026
 */

public class CreaFigura
{
    public static void main(String[] args){
        //---CIRCULO---
        System.out.println("==========CIRCULO==========");
        Random unNumero = new Random();
        double radio = unNumero.nextDouble() * 100.0;
        
        Circulo cir1 = new Circulo(radio,new Punto(0,0));
        
        cir1.desplazar(-240, -230);
        
        cir1.caracteristicas();
        
        double radio2 = unNumero.nextDouble() * 100.0;
        Circulo cir2 = new Circulo(radio2,new Punto(5.2,0.5));
        
        cir2.caracteristicas();
        
        System.out.println("Distancia entre cir1 y cir2: " + cir1.distanciaA(cir2));
        
        Circulo elMasGrande = cir1.elMayor(cir2);
        System.out.println("El círculo mayor es:");
        elMasGrande.caracteristicas();
        
        //---RECTANGULO---
        System.out.println("==========RECTANGULO==========");
        double lado1 = unNumero.nextDouble() * 100.0;
        double lado2 = unNumero.nextDouble() * 100.0;
        
        Rectangulo rect1 = new Rectangulo(lado1,lado2);
        
        rect1.desplazar(40,-20);
        rect1.caracteristicas();
        
        double lado3 = unNumero.nextDouble() * 100.0;
        double lado4 = unNumero.nextDouble() * 100.0;
        Rectangulo rect2 = new Rectangulo(new Punto(7.4,4.5),lado3,lado4);
        
        rect2.caracteristicas();
        System.out.println("La distancia entre los dos rectangulos es de : " + rect1.distanciaA(rect2));
    }
}