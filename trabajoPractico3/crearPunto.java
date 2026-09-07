
/**
 * Write a description of class crearPunto here.
 * 
 * @author GAUNA GASTON LEONEL - BARRIOS MARCOS
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class crearPunto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("--- Creando punto con valores por teclado ---");
        System.out.print("Ingrese coordenada X: ");
        double x = teclado.nextDouble();
        System.out.print("Ingrese coordenada Y: ");
        double y = teclado.nextDouble();
        
        
        Punto p1 = new Punto(x, y);
        p1.mostrar();
        
        System.out.println("\n--- Creando un punto en el origen ---");
        
        Punto p2 = new Punto(); 
        p2.mostrar();
        
        System.out.println("\n--- Desplazando el primer punto ---");
        System.out.print("Ingrese desplazamiento en X (dx): ");
        double dx = teclado.nextDouble();
        System.out.print("Ingrese desplazamiento en Y (dy): ");
        double dy = teclado.nextDouble();
        
        p1.desplazar(dx, dy);
        
        System.out.println("Nuevas coordenadas: " + p1.coordenadas());
        
        System.out.println("=========================");
        System.out.println("Distancia desde p2 hasta p1");
        System.out.println(p2.distanciaA(p1));
    }
}