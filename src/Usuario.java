public class Usuario {
    private String nombre;
    private String correo;
    private int telefono;
    private String password;


    public Usuario(String nombre, String password, String correo, String telefono )
    {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = Integer.parseInt(telefono);
        this.password = password;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
