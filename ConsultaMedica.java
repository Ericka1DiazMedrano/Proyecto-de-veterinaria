import java.time.LocalDateTime;

public class ConsultaMedica {
    private String idConsulta;
    private LocalDateTime fecha;
    private double temperatura;
    private String sintomas;
    private String diagnostico;
    private Veterinario veterinario;
    private RecetaMedica receta;

    public ConsultaMedica(String idConsulta, double temperatura, String sintomas, String diagnostico, Veterinario veterinario) {
        this.idConsulta = idConsulta;
        this.fecha = LocalDateTime.now();
        this.temperatura = temperatura;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.veterinario = veterinario;
    }

    public void asignarReceta(RecetaMedica receta) {
        this.receta = receta;
    }

    public String getIdConsulta() { return idConsulta; }
    public String getDiagnostico() { return diagnostico; }
    public RecetaMedica getReceta() { return receta; }
    public LocalDateTime getFecha() { return fecha; }
}