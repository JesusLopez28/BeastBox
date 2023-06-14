package modelo;

public class Usuario {

    String user;
    String password;
    String pregunta;
    String respuesta;
    int level;
    String listaCostos;

    public Usuario(String user, String password, String pregunta, String respuesta, int level, String listaCostos) {
        this.user = user;
        this.password = password;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.level = level;
        this.listaCostos = listaCostos;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getListaCostos() {
        return listaCostos;
    }

    public void setListaCostos(String listaCostos) {
        this.listaCostos = listaCostos;
    }
    
    
}
