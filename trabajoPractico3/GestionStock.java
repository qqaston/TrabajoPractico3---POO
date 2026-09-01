
/**
 * Esta clase GastionStock se encarga de ejecutar y crear objetos de las clases Laboratorio y Producto
 * 
 * @author GAUNA GASTON LEONEL
 * @version 31/8/26
 */
public class GestionStock
{
    public static void main(String [] args){    
        Laboratorio lab1 = new Laboratorio("Colgate S.A", "Junin 5204", "54-11-4239-8447");
        Producto prod1 = new Producto(1982,"Perfumeria", "Jabon Deluxe", 5.25,lab1);
        
        prod1.ajuste(500);
        
        prod1.mostrar();
        
        
        prod1.ajuste(-200);
        System.out.println("==========================");
        
        prod1.mostrar();
        System.out.println("==========================");
        
        System.out.println(prod1.mostrarLinea());
    }
}