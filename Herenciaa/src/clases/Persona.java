package clases;

public class Persona {

    protected String nombre;

    protected int numeroTel;

    protected int id;

    protected String tipo;

    public Persona(String nombre, int numeroTel, int id, String tipo) {
        this.nombre = nombre;
        this.numeroTel = numeroTel;
        this.id = id;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(int numeroTel) {
        this.numeroTel = numeroTel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
