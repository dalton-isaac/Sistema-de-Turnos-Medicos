//Clase que modela la entidad Paciente
public class Paciente {
    private String nombre;
    private int edad;
    private String motivoConsulta;

    // Constructor
    public Paciente(String nombre, int edad, String motivoConsulta){
        this.nombre = nombre;
        this.edad = edad;
        this.motivoConsulta = motivoConsulta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMotivoConsulta(){
        return motivoConsulta;
    }
}
