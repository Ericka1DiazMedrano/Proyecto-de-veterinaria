import java.util.ArrayList;
import java.util.List;

public class Duenio extends Persona {
    private String correo;
    private List<Mascota> mascotas;

    public Duenio(String id, String nombre, String telefono, String direccion, String correo) {
        super(id, nombre, telefono, direccion);
        this.correo = correo;
        this.mascotas = new ArrayList<>();
    }

    public void agregarMascota(Mascota mascota) {
        mascotas.add(mascota);
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Dueño: " + nombre + " | Tel: " + telefono + " | Correo: " + correo);
    }
}