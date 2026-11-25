package model;

/**
 * Subclase que representa las rutas turísticas gastronómica.
 * Hereda atributos de la superclase ServicioTuristico.
 * Se incorpora el atributo numeroDeParadas.
 */
public class RutaGastronomica extends ServicioTuristico {
    // Atributos de la clase
    private int numeroDeParadas;

    // Constructor de la clase
    public RutaGastronomica(String nombre, double duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras); // Llamamos al constructor de la clase padre
        this.numeroDeParadas = numeroDeParadas;
    }

    // Método Getters y setters
    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }
    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + " con " + numeroDeParadas + " paradas";
    }


}
