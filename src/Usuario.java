public class Usuario {
    private String nombre;
    private String direccion;
    private long telefono;
    private String ced;
    public boolean librosPrestados;

    public Usuario(String nombre, String direccion, Long telefono, String ced) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ced=ced;
        this.librosPrestados = false;
    }

    public String getCed() {
        return ced;
    }

    public void setCed(String ced) {
        this.ced = ced;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
