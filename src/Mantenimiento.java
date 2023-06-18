
public class Mantenimiento extends Animales{
    
    
public String Alimentacion;
public String medicamentos;
public String Diagnostico;

public Mantenimiento(){
  super();
this.Alimentacion=" " ;
this.medicamentos="";
this.Diagnostico=" ";
       
}

 public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public String getEdadAnimal() {
        return edadAnimal;
    }

    public void setEdadAnimal(String edadAnimal) {
        this.edadAnimal = edadAnimal;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getAlimentacion() {
        return Alimentacion;
    }

    public void setAlimentacion(String Alimentacion) {
        this.Alimentacion = Alimentacion;
    }

    public String getDiagnostico() {
        return Diagnostico;
    }

    public void setDiagnostico(String Diagnostico) {
        this.Diagnostico = Diagnostico;
    }


    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }
    


}
