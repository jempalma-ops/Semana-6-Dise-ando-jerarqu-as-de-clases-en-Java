package ui;

import data.GestorServicios;

/**
 * Clase principal del sistema Llanquihue Tour.
 * Se encarga de ejecutar el programa y llamar al método
 * que gestiona la presentación de los servicios turísticos.
 */
public class Main {
    public static void main(String[] args) {

        // Crea un objeto tipo GestorServicios
        GestorServicios gestorServicios = new GestorServicios();

        // Método para mostrar los servicios de prueba
        gestorServicios.mostrarServiciosPrueba();
    }
}