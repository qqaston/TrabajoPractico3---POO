import java.util.Scanner;

/**
 * Esta clase GestionStock se encarga de ejecutar y crear objetos de las clases Laboratorio y Producto,
 * implementando un menú interactivo para su gestión.
 * 
 * @author GAUNA GASTON LEONEL - BARRIOS MARCOS
 * @version 31/8/26
 */
public class GestionStock {
    
    public static void main(String [] args) {
        // Inicializamos el Scanner para leer el teclado
        Scanner teclado = new Scanner(System.in);
        
        // Instanciamos el laboratorio y el producto iniciales
        Laboratorio lab1 = new Laboratorio("Colgate S.A", "Junin 5204", "54-11-4239-8447");
        Producto prod1 = new Producto(1982, "Perfumeria", "Jabon Deluxe", 5.25, lab1);
        
        int opcion;
        
        // Bucle do-while: ejecuta el menu al menos una vez y repite mientras la opcion no sea 0
        do {
            System.out.println("\n=================================");
            System.out.println("      MENU GESTION DE STOCK      ");
            System.out.println("=================================");
            System.out.println("1. Mostrar detalles del producto");
            System.out.println("2. Ajustar stock (Agregar/Quitar)");
            System.out.println("3. Ver precio de lista y al contado");
            System.out.println("4. Mostrar resumen (Línea)");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = teclado.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("\n--- Detalles del Producto ---");
                    prod1.mostrar(); // Llama al metodo mostrar de Producto
                    break;
                    
                case 2:
                    System.out.print("\nIngrese la cantidad a ajustar (use negativo para restar): ");
                    int cantidad = teclado.nextInt();
                    prod1.ajuste(cantidad); // Ajusta el stock sumando o restando
                    System.out.println("Stock actualizado correctamente.");
                    break;
                    
                case 3:
                    System.out.println("\n--- Precios ---");
                    // Muestra los calculos solicitados
                    System.out.println("Precio de Lista (+12%): $" + prod1.precioLista());
                    System.out.println("Precio al Contado (-5%): $" + prod1.precioContado());
                    break;
                    
                case 4:
                    System.out.println("\n--- Resumen ---");
                    System.out.println(prod1.mostrarLinea()); // Retorna el String
                    break;
                    
                case 0:
                    System.out.println("\nSaliendo del sistema de gestión...");
                    break;
                    
                default:
                    System.out.println("\nOpciOn no vAlida. Intente nuevamente.");
            }
            
        } while (opcion != 0);
        teclado.close();
    }
}