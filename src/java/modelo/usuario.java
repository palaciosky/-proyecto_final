
package modelo;

/**
 *
 * @author Mario CD
 */
public class usuario extends conexion{
    String dui_Usuario;
    String Nombres;
    String Apellidos;
    String email;
    String Usuario;
    String clave;
    String tipo;

    public String getDui_Usuario() {
        return dui_Usuario;
    }

    public void setDui_Usuario(String dui_Usuario) {
        this.dui_Usuario = dui_Usuario;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public usuario(String dui_Usuario, String Nombres, String Apellidos, String email, String Usuario, String clave, String tipo) {
        this.dui_Usuario = dui_Usuario;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.email = email;
        this.Usuario = Usuario;
        this.clave = clave;
        this.tipo = tipo;
    }
}
