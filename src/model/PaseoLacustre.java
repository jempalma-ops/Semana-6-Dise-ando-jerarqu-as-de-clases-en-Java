package model;

/**
 * Subclase que representa los paseos lacustres.
 * Hereda atributos de la superclase ServicioTuristico.
 * Se incorpora el atributo tipoEmbarcacion.
 */
public class PaseoLacustre extends ServicioTuristico{
    // Atributos de la clase
    private String tipoEmbarcacion;

    // Constructor de la clase
    public PaseoLacustre(String nombre, double duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras); // Llamamos al constructor de la clase padre
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    // Metodo getter y setter
    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + " en la embarcación " + tipoEmbarcacion;
    }
}
