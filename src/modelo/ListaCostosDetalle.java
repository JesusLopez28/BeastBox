package modelo;

public class ListaCostosDetalle extends ListaCostos{

    private double pesoMinimo;
    private double pesoMaximo;
    private int zona;
    private String servicio;
    private double precio;
    private String listaCostos;

    public ListaCostosDetalle(String nombre, int areaRemota, int seguro, boolean paqueteFragil, int excesoPeso, boolean sobreDimension, double pesoMinimo, double pesoMaximo, int zona, String servicio, double precio, String listaCostos) {
        super(nombre, areaRemota, seguro, paqueteFragil, excesoPeso, sobreDimension);
        this.pesoMinimo = pesoMinimo;
        this.pesoMaximo = pesoMaximo;
        this.zona = zona;
        this.servicio = servicio;
        this.precio = precio;
        this.listaCostos = listaCostos;
    }


    public double getPesoMinimo() {
        return pesoMinimo;
    }

    public void setPesoMinimo(double pesoMinimo) {
        this.pesoMinimo = pesoMinimo;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getListaCostos() {
        return listaCostos;
    }

    public void setListaCostos(String listaCostos) {
        this.listaCostos = listaCostos;
    }
    
    
}
