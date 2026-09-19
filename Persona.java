public abstract class Persona {
    protected String id;
    protected String nombre;
    protected String telefono;
    protected String direccion;

    public Persona(String id, String nombre, String telefono, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }
    public String getDireccion() { return direccion; }

    public abstract void mostrarInformacion();
}