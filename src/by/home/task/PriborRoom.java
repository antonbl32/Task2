package by.home.task;

public class PriborRoom extends Pribor {
    private int estPult; //Наличие дистанционного управления
    private int nadoInt; //Требуется наличие доступа в интернет

    public PriborRoom(String namePrib, String modelPrib, int powerPrib, int groupNom,int estPult, int nadoInt) {
        super(namePrib, modelPrib, powerPrib, groupNom);
        this.estPult=estPult;
        this.nadoInt=nadoInt;

    }

    public int getEstPult() {
        return estPult;
    }

    public void setEstPult(int estPult) {
        this.estPult = estPult;
    }

    public int getNadoInt() {
        return nadoInt;
    }

    public void setNadoInt(int nadoInt) {
        this.nadoInt = nadoInt;
    }
}

