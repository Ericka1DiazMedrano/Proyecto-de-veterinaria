import java.util.ArrayList;
import java.util.List;

public class RecetaMedica {
    private String idReceta;
    private String indicacionesGenerales;
    private List<Medicamento> medicamentos;

    public RecetaMedica(String idReceta, String indicacionesGenerales) {
        this.idReceta = idReceta;
        this.indicacionesGenerales = indicacionesGenerales;
        this.medicamentos = new ArrayList<>();
    }

    public void agregarMedicamento(Medicamento med) {
        medicamentos.add(med);
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public String getIndicacionesGenerales() {
        return indicacionesGenerales;
    }
}