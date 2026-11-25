package model;

/**
 * Superclase que representa los servicios turísticos de la agencia Llanquihue Tour.
 * Contiene los atributos de nombre y duracion que son heredados
 * por las subclases RutaGastronomica, PaseoLacustre y ExcursionCultural.
 */
public class ServicioTuristico {
    // Atributos de la clase
    private String nombre;
    private double duracionHoras;

    // Constructor de la clase
    public ServicioTuristico(String nombre, double duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    // Método getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(double duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    // Método toString
    @Override
    public String toString() {
        return "Servicio: " + nombre +
                ", Duración: " + duracionHoras + " horas";
    }
}
