package by.home.task;

public class PriborRoom extends Pribor {
    private static int countR=0; //Количество приборов комнаты
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
    public int getNadoInt() {
        return nadoInt;
    }

}

