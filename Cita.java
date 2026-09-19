import java.time.LocalDateTime;

public class Cita {
    private String idCita;
    private LocalDateTime fechaHora;
    private String motivo;
    private String estado; // "Pendiente", "Completada", "Cancelada"
    private Mascota mascota;
    private Veterinario veterinario;

    public Cita(String idCita, LocalDateTime fechaHora, String motivo, Mascota mascota, Veterinario veterinario) {
        this.idCita = idCita;
        this.fechaHora = fechaHora;
        this.motivo = motivo;
        this.estado = "Pendiente";
        this.mascota = mascota;
        this.veterinario = veterinario;
    }

    public void marcarCompletada() { this.estado = "Completada"; }
    public void cancelarCita() { this.estado = "Cancelada"; }
    public String getEstado() { return estado; }
}