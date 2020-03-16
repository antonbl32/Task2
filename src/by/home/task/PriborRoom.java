package by.home.task;

public class PriborRoom extends Pribor {
    public static int countR=0; //Количество приборов комнаты
    private int estPult; //Наличие дистанционного управления
    private int nadoInt; //Требуется наличие доступа в интернет

    public PriborRoom(String namePrib, String modelPrib, int powerPrib, int groupNom,int estPult, int nadoInt) {
        super(namePrib, modelPrib, powerPrib, groupNom);
        this.estPult=estPult;
        this.nadoInt=nadoInt;
        countR++;
        Test.count++;
    }

    public int getEstPult() {
        return estPult;
    }
    public int getNadoInt() {
        return nadoInt;
    }

    @Override
    public String toString() {
        return "\nПриборы комнаты {"  +this.getNamePrib()+
                " модель: "+ this.getModelPrib()+
                ", наличие пульта= " + estPult +
                ", надо доступ к интернету=" + nadoInt +
                '}';
    }
}

