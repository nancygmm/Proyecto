import java.util.ArrayList;
public class Dia {
    private String dia;
    private ArrayList<Boolean>horarios=new ArrayList<Boolean>();

    public Dia(String dia) {
        this.dia = dia;
        for(int i=0;i<20;i++){
            horarios.add(false);
        }
    }

    public String getDia() {
        return this.dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

}
