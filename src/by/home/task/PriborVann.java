package by.home.task;

public class PriborVann extends Pribor{
   private String dataTO; //Дата следующего технического обслуживания
   private String dataZamFiltr; //Дата замены фильтра или сменного элемента
    public PriborVann(String namePrib, String modelPrib, int powerPrib, int groupNom, String dataTO,String zamFiltr) {
        super(namePrib, modelPrib, powerPrib, groupNom);
        this.dataTO=dataTO;
        this.dataZamFiltr=zamFiltr;
    }

    public String getDataTO() {
        return dataTO;
    }

    public void setDataTO(String dataTO) {
        this.dataTO = dataTO;
    }

    public String getDataZamFiltr() {
        return dataZamFiltr;
    }

    public void setDataZamFiltr(String dataZamFiltr) {
        this.dataZamFiltr = dataZamFiltr;
    }
}
