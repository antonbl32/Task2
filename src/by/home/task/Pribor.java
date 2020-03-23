package by.home.task;

public class Pribor {
   private String namePrib; //Название прибора
   private String modelPrib; //Модель прибора
   private Double powerPrib; //Мощность прибора
   private int groupNom; // Номер группы прибора
   private boolean onDev;//Статус включен в сеть или нет
    public Pribor(String namePrib, String modelPrib,Double powerPrib, int groupNom){
        this.namePrib=namePrib;
        this.modelPrib=modelPrib;
        this.powerPrib=powerPrib;
        this.groupNom=groupNom;
        this.onDev=false;
    }
    public String getNamePrib() {
        return namePrib;
    }
    public String getModelPrib() {
        return modelPrib;
    }
    public Double getPowerPrib() {
        return powerPrib;
    }
    public int getGroupNom() {
        return groupNom;
    }
    public boolean getOnDev() {
        return onDev;
    }
    public void setOnDev(boolean onDev) {
        this.onDev = onDev;
    }
}
