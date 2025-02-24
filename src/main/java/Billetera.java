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
    public Billetera(Usuario usuario, Set<String> numerosExistentes) {
        do {
            this.num = UUID.randomUUID().toString().substring(0, 10);
        } while (numerosExistentes.contains(this.num));
        numerosExistentes.add(this.num);
        this.saldo = 0;
        this.transacciones = new ArrayList<>();
        this.usuario = usuario;
    }

    public void recargar(float monto) {
        if (monto <= 0) throw new IllegalArgumentException("El monto debe ser positivo");
        saldo += monto;
    }

    public void realizarTransaccion(Billetera destino, float monto, Categoria categoria) {
        if (monto + 200 > saldo) throw new IllegalArgumentException("Saldo insuficiente");
        saldo -= (monto + 200);
        destino.saldo += monto;
        Transaccion t = new Transaccion(monto, LocalDateTime.now(), categoria, this, destino);
        transacciones.add(t);
        destino.transacciones.add(t);

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
        for(i=1 , 1==10, 1++) { int ab=5; int c=4;}
}
