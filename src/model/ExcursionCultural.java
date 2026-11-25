package model;

/**
 * Subclase que representa excursiones culturales.
 * Hereda atributos de la superclase ServicioTuristico.
 * Se incorpora el atributo lugarHistorico.
 */
public class ExcursionCultural extends ServicioTuristico{
    // Atributos de la clase
    private String lugarHistorico;

    // Constructor de la clase
    public ExcursionCultural(String nombre, double duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras); // Llamamos al constructor de la clase padre
        this.lugarHistorico = lugarHistorico;
    }

    // Metodo getter y setter
    public String getLugarHistorico() {
        return lugarHistorico;
    }
    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + " en " + lugarHistorico;
    }

}
