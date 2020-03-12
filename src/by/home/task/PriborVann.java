package by.home.task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PriborVann extends Pribor{
    private final SimpleDateFormat sd=new SimpleDateFormat("dd.MM.yyyy");
    private Date dataTO; //Дата следующего технического обслуживания
    private Date dataZamFiltr; //Дата замены фильтра или сменного элемента
    public PriborVann(String namePrib, String modelPrib, int powerPrib, int groupNom, String dataTO,String zamFiltr) throws ParseException {
        super(namePrib, modelPrib, powerPrib, groupNom);
        try {
            this.dataTO = sd.parse(dataTO);
            this.dataZamFiltr = sd.parse(zamFiltr);

        }catch (ParseException s){
            System.out.println("Не верный формат данных");
        }
    }
    public Date getDataTO() {
        return dataTO;
    }

    public void setDataTO(Date dataTO) {
        this.dataTO = dataTO;
    }

    public Date getDataZamFiltr() {
        return dataZamFiltr;
    }

    public void setDataZamFiltr(Date dataZamFiltr) {
        this.dataZamFiltr = dataZamFiltr;
    }
}
