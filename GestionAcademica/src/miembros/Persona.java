package miembros;

import java.time.LocalDate;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected int du;
    protected LocalDate fechaNacimiento;
    protected String sexo;
    private String correo;

    public Persona(String nombre, String apellido, int du, LocalDate fechaNacimiento, String sexo) {
        setNombre(nombre);
        setApellido(apellido);
        setDu(du);
        setFechaNacimiento(fechaNacimiento);
        setSexo(sexo);
        setCorreo(nombre, apellido);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDu() {
        return du;
    }

    public void setDu(int du) {
        this.du = du;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String nombre, String apellido) {
        //TODO: hacer método parametrizado
        this.correo = nombre.toLowerCase() + "." + apellido.toLowerCase() + "@alumnos.frm.utn.edu.ar";
    }
}
