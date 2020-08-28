public class Aviso {
    private static final int MAXIMO = 99999;
    private static final int MINIMO = 1;
    private String titulo;
    private String descripcion;
    private int precio;
    private int id;
    private String creador;


    public Aviso (String creador, String titulo, String descripcion, String precio)
    {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.precio = Integer.parseInt(precio);
        this.id = (int) (Math.random() * ((MAXIMO - MINIMO) + 1)) + MINIMO;
        this.creador = creador;


    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }



    public int getId() {
        return id;
    }

    /*
    Esto no deberia cambiar
    public void setId(int id) {
        this.id = id;
    }
    */

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }
}
