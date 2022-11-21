public class Intervalo{
    private int Hinicio;
    private int Hfinal;
    private String estatus;
    public Intervalo(int hinicio, int hfinal, String estatus) {
        Hinicio = hinicio;
        Hfinal = hfinal;
        this.estatus = estatus;
    }
    public int getHinicio() {
        return Hinicio;
    }
    public void setHinicio(int hinicio) {
        Hinicio = hinicio;
    }
    public int getHfinal() {
        return Hfinal;
    }
    public void setHfinal(int hfinal) {
        Hfinal = hfinal;
    }
    public String getEstatus() {
        return estatus;
    }
    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

}