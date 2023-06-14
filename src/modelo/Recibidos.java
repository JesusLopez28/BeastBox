package modelo;

public class Recibidos extends Envio{

    private int id;
    private String numeroG;
    private String FechaLlegada;
    private String HoraLlegada;
    private String FechaEntrega;
    private String HoraEntrega;

    public Recibidos(String numeroGuia, String sucursalOrigen, String sucursalDestino, double peso, double alto, double largo, double ancho, String user, String status, int id, String numeroG, String FechaLlegada, String HoraLlegada, String FechaEntrega, String HoraEntrega ) {
        super(numeroGuia, sucursalOrigen, sucursalDestino, peso, alto, largo, ancho, user, status);
        this.id = id;
        this.numeroG = numeroG;
        this.FechaLlegada = FechaLlegada;
        this.HoraLlegada = HoraLlegada;
        this.FechaEntrega = FechaEntrega;
        this.HoraEntrega = HoraEntrega;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroG() {
        return numeroG;
    }

    public void setNumeroG(String NumeroGuia) {
        this.numeroG = NumeroGuia;
    }

    public String getFechaLlegada() {
        return FechaLlegada;
    }

    public void setFechaLlegada(String FechaLlegada) {
        this.FechaLlegada = FechaLlegada;
    }

    public String getHoraLlegada() {
        return HoraLlegada;
    }

    public void setHoraLlegada(String HoraLlegada) {
        this.HoraLlegada = HoraLlegada;
    }

    public String getFechaEntrega() {
        return FechaEntrega;
    }

    public void setFechaEntrega(String FechaEntrega) {
        this.FechaEntrega = FechaEntrega;
    }

    public String getHoraEntrega() {
        return HoraEntrega;
    }

    public void setHoraEntrega(String HoraEntrega) {
        this.HoraEntrega = HoraEntrega;
    }
    
    
}
