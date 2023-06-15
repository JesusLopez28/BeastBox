package modelo;

public class Recibidos{

    private String numeroGuia;
    private String FechaLlegada;
    private String HoraLlegada;
    private String FechaEntrega;
    private String HoraEntrega;

    public Recibidos(String numeroGuia, String FechaLlegada, String HoraLlegada, String FechaEntrega, String HoraEntrega) {
        this.numeroGuia = numeroGuia;
        this.FechaLlegada = FechaLlegada;
        this.HoraLlegada = HoraLlegada;
        this.FechaEntrega = FechaEntrega;
        this.HoraEntrega = HoraEntrega;
    }

    public String getNumeroGuia() {
        return numeroGuia;
    }

    public void setNumeroGuia(String numeroGuia) {
        this.numeroGuia = numeroGuia;
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
