public class Mascota {
    private String idMascota;
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private double peso;
    private Duenio duenio;
    private HistorialClinico historial;

    public Mascota(String idMascota, String nombre, String especie, String raza, int edad, double peso, Duenio duenio) {
        this.idMascota = idMascota;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.duenio = duenio;
        this.historial = new HistorialClinico("HIST-" + idMascota);
    }

    public String getIdMascota() { return idMascota; }
    public String getNombre() { return nombre; }
    public HistorialClinico getHistorial() { return historial; }
    public Duenio getDuenio() { return duenio; }
    public void setPeso(double peso) { this.peso = peso; }
}