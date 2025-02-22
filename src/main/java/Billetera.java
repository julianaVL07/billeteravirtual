import java.util.ArrayList;

public class Billetera {
    private String num;
    private float saldo;
    private ArrayList<Transaccion>transacciones;
    private Usuario usuario;

    public Billetera(String num, float saldo,Usuario usuario) {
        this.num = num;
        this.saldo = saldo;
        this.transacciones =new ArrayList<>();
        this.usuario = usuario;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(ArrayList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Billetera{" +
                "num='" + num + '\'' +
                ", saldo=" + saldo +
                ", transacciones=" + transacciones +
                ", usuario=" + usuario.getNombre()+
                '}';
    }

    public void generarNumeroAleatorio (int i){
        for(i=1 , 1==10, 1++) { int ab=5;}
}
