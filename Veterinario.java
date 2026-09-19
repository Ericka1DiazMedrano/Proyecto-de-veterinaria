public class Veterinario extends Persona {
    private String numeroColegiado;
    private String especialidad;

    public Veterinario(String id, String nombre, String telefono, String direccion, String numeroColegiado, String especialidad) {
        super(id, nombre, telefono, direccion);
        this.numeroColegiado = numeroColegiado;
        this.especialidad = especialidad;
    }

    public String getNumeroColegiado() { return numeroColegiado; }
    public String getEspecialidad() { return especialidad; }

    @Override
    public void mostrarInformacion() {
        System.out.println("Dr(a). " + nombre + " | Col: " + numeroColegiado + " | Esp: " + especialidad);
    }
}