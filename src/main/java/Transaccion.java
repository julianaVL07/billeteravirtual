import java.time.LocalDate;
import java.time.LocalDateTime;

public class Transaccion {
    private String idTransaccion;
    private LocalDateTime fecha;
    private float costo;
    private Billetera origen;
    private Billetera destino;
    private float valor;
    private Billetera billetera;
    private Usuario usuario;
    private Categoria categoria;

    public Transaccion(LocalDateTime fecha, float costo, Billetera origen, Billetera destino, float valor, Billetera billetera, Usuario usuario, Categoria categoria, String idTransaccion) {
        this.idTransaccion = idTransaccion;
        this.fecha = fecha;
        this.costo = costo;
        this.usuario = usuario;
        this.destino = destino;
        this.valor = valor;
        this.billetera = billetera;
        this.usuario = usuario;
        this.categoria = categoria;
    }

    public String getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public LocalDateTime  fecha () {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public Billetera  getOrigen() {
        return origen;
    }

    public void setOrigen(Billetera origen) {
        this.origen = origen;
    }

    public Billetera getDestino() {
        return destino;
    }

    public void setDestino(Billetera destino) {
        this.destino = destino;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Billetera getBilletera() {
        return billetera;
    }

    public void setBilletera(Billetera billetera) {
        this.billetera = billetera;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Transaccion{" +
                "idTransaccion='" + idTransaccion + '\'' +
                ", fecha=" + fecha +
                ", costo=" + costo +
                ", usuarioRemitente='" + origen + '\'' +
                ", usuarioDestino='" + destino + '\'' +
                ", valor=" + valor +
                ", billetera=" + billetera +
                ", usuario=" + usuario +
                ", categoria=" + categoria +
                '}';
    }
}
