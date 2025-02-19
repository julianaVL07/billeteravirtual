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
}