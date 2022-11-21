import java.util.ArrayList;
public class Horario {
    private Hospital hosp=new Hospital(null, null, null);
    private ArrayList<Dia> horarios=new ArrayList<Dia>();

    public Horario(Hospital hosp) {
        this.hosp = hosp;
        Dia lunes=new Dia("lunes");
        Dia martes=new Dia("martes");
        Dia miercoles=new Dia("miercoles");
        Dia jueves=new Dia("jueves");
        Dia viernes=new Dia("viernes");
        horarios.add(lunes);
        horarios.add(martes);
        horarios.add(miercoles);
        horarios.add(jueves);
        horarios.add(viernes);
    }
    


    public Hospital getHosp() {
        return this.hosp;
    }

    public void setHosp(Hospital hosp) {
        this.hosp = hosp;
    }

    public ArrayList<Dia> getHorarios() {
        return this.horarios;
    }

    public void setHorarios(ArrayList<Dia> horarios) {
        this.horarios = horarios;
    }
}