package cuatro;

public class Persona {
    private String nombre;
    private String apellido;
    private String calle;
    private String telefono;
    private String[] aficiones;

    public Persona(String nombre, String apellido, String calle, String telefono, String[] aficiones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.calle = calle;
        this.telefono = telefono;
        this.aficiones = aficiones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String[] getAficiones() {
        return aficiones;
    }

    public void setAficiones(String[] aficiones) {
        this.aficiones = aficiones;
    }
}
