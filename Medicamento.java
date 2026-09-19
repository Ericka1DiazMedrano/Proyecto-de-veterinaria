public class Medicamento {
    private String nombre;
    private String dosis;
    private String frecuencia;
    private int duracionDias;

    public Medicamento(String nombre, String dosis, String frecuencia, int duracionDias) {
        this.nombre = nombre;
        this.dosis = dosis;
        this.frecuencia = frecuencia;
        this.duracionDias = duracionDias;
    }

    public String getDetalle() {
        return nombre + " (" + dosis + ") - Cada " + frecuencia + " por " + duracionDias + " días.";
    }
}