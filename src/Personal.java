
public class Personal {
    private String Nombre;
    private String PrimerApell;
    private String SegundoApell;
    private String Nacionalidad;
    private String edad;
    private String Correo;
    private String NumEmpleado;
    
    public Personal(){
        this.Nombre="";
        this.PrimerApell="";
        this.SegundoApell="";
        this.Nacionalidad="";
        this.edad="";
        this.Correo="";
        this.NumEmpleado="";
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPrimerApell() {
        return PrimerApell;
    }

    public void setPrimerApell(String PrimerApell) {
        this.PrimerApell = PrimerApell;
    }

    public String getSegundoApell() {
        return SegundoApell;
    }

    public void setSegundoApell(String SegundoApell) {
        this.SegundoApell = SegundoApell;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getNumEmpleado() {
        return NumEmpleado;
    }

    public void setNumEmpleado(String NumEmpleado) {
        this.NumEmpleado = NumEmpleado;
    }
    
}
