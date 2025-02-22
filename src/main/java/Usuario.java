import java.util.ArrayList;

public class Usuario {
    private String  nombre;
    private String direccion;
    private String id;
    private String correo;
    private String contrasena;
    private ArrayList<Transaccion>transacciones;
    private Billetera billetera;

    public Usuario(String nombre, String direccion, String id, String correo, String contrasena, Billetera billetera) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.id = id;
        this.correo = correo;
        this.contrasena = contrasena;
        this.transacciones = new ArrayList<>();
        this.billetera = billetera;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public ArrayList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(ArrayList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public Billetera getBilletera() {
        return billetera;
    }

    public void setBilletera(Billetera billetera) {
        this.billetera = billetera;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", id='" + id + '\'' +
                ", correo='" + correo + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", transacciones=" + transacciones +
                ", billetera=" + billetera.getNum() +
                '}';
    }
}
