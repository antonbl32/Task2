package by.home.task;

public class Pribor {
   private String namePrib; //Название прибора
   private String modelPrib; //Модель прибора
   private int powerPrib; //Мощность прибора
   private int groupNom; // Номер группы прибора
    public Pribor(String namePrib, String modelPrib,int powerPrib, int groupNom){
        this.namePrib=namePrib;
        this.modelPrib=modelPrib;
        this.powerPrib=powerPrib;
        this.groupNom=groupNom;
    }
    public String getNamePrib() {
        return namePrib;
    }
    public String getModelPrib() {
        return modelPrib;
    }
    public int getPowerPrib() {
        return powerPrib;
    }
    public int getGroupNom() {
        return groupNom;
    }
}
