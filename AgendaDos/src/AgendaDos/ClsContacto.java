
package AgendaDos;

public class ClsContacto {
    private String nombre;
    private String apellido;
    private String telefono;
    private ClsContacto anterior;
    private ClsContacto siguiente;

        
    
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public ClsContacto getAnterior() {
        return anterior;
    }

    public void setAnterior(ClsContacto anterior) {
        this.anterior = anterior;
    }

    public ClsContacto getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(ClsContacto siguiente) {
        this.siguiente = siguiente;
    }
    
}
