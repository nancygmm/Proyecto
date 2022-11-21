import java.util.*;

public class Hospital {
    private String nombre;
    private ArrayList<Horario> horario;
    private ArrayList<Vacunas> vacunas;
    
    public Hospital(String nombre, ArrayList<Horario> horario, ArrayList<Vacunas> vacunas) {
        this.nombre = nombre;
        this.horario = horario;
        this.vacunas = vacunas;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Horario> getHorario() {
        return horario;
    }
    public void setHorario(ArrayList<Horario> horario) {
        this.horario = horario;
    }
    public ArrayList<Vacunas> getVacunas() {
        return vacunas;
    }
    public void setVacunas(ArrayList<Vacunas> vacunas) {
        this.vacunas = vacunas;
    }
    
}

