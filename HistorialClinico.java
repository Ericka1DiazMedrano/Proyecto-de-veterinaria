import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HistorialClinico {
    private String idHistorial;
    private LocalDate fechaCreacion;
    private List<ConsultaMedica> consultas;

    public HistorialClinico(String idHistorial) {
        this.idHistorial = idHistorial;
        this.fechaCreacion = LocalDate.now();
        this.consultas = new ArrayList<>();
    }

    public void agregarConsulta(ConsultaMedica consulta) {
        consultas.add(consulta);
    }

    public List<ConsultaMedica> getConsultas() {
        return consultas;
    }
}