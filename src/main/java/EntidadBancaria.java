import java.util.ArrayList;

public class EntidadBancaria {
    private  String nombre;
    private ArrayList<Usuario>usuarios;
    private ArrayList<Billetera>billeteras;
    private ArrayList<Transaccion>transacciones;

    public EntidadBancaria(String nombre) {
        this.nombre = nombre;
        this.usuarios= new ArrayList<>();
        this.billeteras= new ArrayList<>();
        this.transacciones= new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Billetera> getBilleteras() {
        return billeteras;
    }

    public void setBilleteras(ArrayList<Billetera> billeteras) {
        this.billeteras = billeteras;
    }

    public ArrayList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(ArrayList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    @Override
    public String toString() {
        return "EntidadBancaria{" +
                "nombre='" + nombre + '\'' +
                ", usuarios=" + usuarios +
                ", billeteras=" + billeteras +
                ", transacciones=" + transacciones +
                '}';
    }
}