package alurachallenge.foro_hub.model;

public class Topico {
    private int id;
    private String usuario;
    private String titulo;
    private String mensaje;

    public Topico(int id, String usuario, String titulo, String mensaje) {
        this.id = id;
        this.usuario = usuario;
        this.titulo = titulo;
        this.mensaje = mensaje;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
