package jframe_proyectofinal;

public class Estudiante {
    private String nombres;
    private String apellidos;
    private String nombreUsuario;
    private String correo;
    private String contrasena;
    private int edad;
    private String sexo;

    public Estudiante(String nombres, String apellidos, String nombreUsuario, String correo, String contrasena, int edad, String sexo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.contrasena = contrasena;
        this.edad = edad;
        this.sexo = sexo;
    }

    // Métodos getter
    public String getNombres() { return nombres; }
    public String getApellidos() { return apellidos; }
    public String getNombreUsuario() { return nombreUsuario; }
    public String getCorreo() { return correo; }
    public String getContrasena() { return contrasena; }
    public int getEdad() { return edad; }
    public String getSexo() { return sexo; }

    // Métodos setter
    public void setContrasena(String nuevaContrasena) { this.contrasena = nuevaContrasena; }
}

