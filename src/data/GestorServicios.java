package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;

/**
 * Clase encargada de gestionar la creación de objetos de prueba
 * de cada una de las subclases de ServicioTuristico.
 * Prepara los objetos para ser utilizados y mostrados desde Main.
 */
public class GestorServicios {
    // Método para mostrar los servicios de prueba
    public void mostrarServiciosPrueba() {
        System.out.println("=========================================================================================");
        System.out.println("              LLANQUIHUE TOUR - ACTUALIZADO CATÁLOGO DE SERVICIOS TURÍSTICOS               ");
        System.out.println("=========================================================================================\n");

        // 1. Instancias de Objeto tipo RutaGastronomica
        RutaGastronomica ruta1 = new RutaGastronomica("Sabores de Frutillar y Kuchen Tradicional", 4.5, 4);
        RutaGastronomica ruta2 = new RutaGastronomica("Ruta del Salmón y Curanto en Angelmó", 5.0, 3);

        // 2. Instancias de Objeto tipo PaseoLacustre
        PaseoLacustre paseo1 = new PaseoLacustre("Navegación Lago Todos los Santos", 3.0, "Catamarán");
        PaseoLacustre paseo2 = new PaseoLacustre("Travesía Bahía de Puerto Varas", 1.5, "Lancha Techada");

        // 3. Instancias de Objeto tipo ExcursionCultural
        ExcursionCultural excursion1 = new ExcursionCultural("Circuito Colonización Alemana", 4.0,"Cuenca del Lago Llanquihue" );
        ExcursionCultural excursion2 = new ExcursionCultural("Patrimonio Jesuita e Iglesias Chiloé Continental", 6.0, "Iglesia San Nicolás de Toletino");

        // Despliegue por consola utilizando el método toString()
        System.out.println("--- RUTAS GASTRONÓMICAS ---");
        System.out.println(ruta1);
        System.out.println(ruta2);

        System.out.println("\n--- PASEOS LACUSTRES ---");
        System.out.println(paseo1);
        System.out.println(paseo2);

        System.out.println("\n--- EXCURSIONES CULTURALES ---");
        System.out.println(excursion1);
        System.out.println(excursion2);

        System.out.println("\n=========================================================================================");
    }

}
