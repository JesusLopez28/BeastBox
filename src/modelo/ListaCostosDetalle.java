package modelo;

public class ListaCostosDetalle{

    private float pesoMinimo;
    private float pesoMaximo;
    private String sucursal;
    private String servicio;
    private float precio;
    private String listaCostos;

    public ListaCostosDetalle(float pesoMinimo, float pesoMaximo, String sucursal, String servicio, float precio, String listaCostos) {
        this.pesoMinimo = pesoMinimo;
        this.pesoMaximo = pesoMaximo;
        this.sucursal = sucursal;
        this.servicio = servicio;
        this.precio = precio;
        this.listaCostos = listaCostos;
    }

    public float getPesoMinimo() {
        return pesoMinimo;
    }

    public void setPesoMinimo(float pesoMinimo) {
        this.pesoMinimo = pesoMinimo;
    }

    public float getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(float pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getListaCostos() {
        return listaCostos;
    }

    public void setListaCostos(String listaCostos) {
        this.listaCostos = listaCostos;
    }

    
}
