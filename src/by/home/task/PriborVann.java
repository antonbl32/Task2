package by.home.task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PriborVann extends Pribor{
    public static int countV=0; //Количество приборов ванны
    private final SimpleDateFormat sd=new SimpleDateFormat("dd.MM.yyyy");
    private Date dataTO; //Дата следующего технического обслуживания
    private Date dataZamFiltr; //Дата замены фильтра или сменного элемента
    public PriborVann(String namePrib, String modelPrib, Double powerPrib, int groupNom, String dataTO,String zamFiltr)  {
        super(namePrib, modelPrib, powerPrib, groupNom);
        try {
            this.dataTO = sd.parse(dataTO);
            this.dataZamFiltr = sd.parse(zamFiltr);

        }catch (ParseException s){
            System.out.println("Не верный формат данных");
        countV++;
        Test.count++;
        }
    }
    public Date getDataTO() {
        return dataTO;
    }
    public Date getDataZamFiltr() {
        return dataZamFiltr;
    }
    @Override
    public String toString() {
        return "\nПриборы ванны {"  +this.getNamePrib()+
                " модель: "+ this.getModelPrib()+
                ", дата след. ТО= " + sd.format(dataTO) +
                ", дата замены фильтра=" + sd.format(dataZamFiltr) +
                '}';
    }
}
