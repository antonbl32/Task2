package by.home.task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PriborKuhn extends Pribor {
    private final SimpleDateFormat sd=new SimpleDateFormat("dd.MM.yyyy");
    private Date dataTO; //Дата следующего технического обслуживания
    private int emkost; //Масса или обьем загружаемых продуктов(посуды)

    public PriborKuhn(String namePrib, String modelPrib, int powerPrib, int groupNom, String dataTO,int emkost) throws ParseException {
        super(namePrib, modelPrib, powerPrib, groupNom);
        try {
            this.dataTO = sd.parse(dataTO);
            this.emkost = emkost;
        } catch (ParseException s) {
            System.out.println("Не верный формат данных");
        }
    }
    public Date getDataTO() {
        return dataTO;
    }

    public void setDataTO(Date dataTO) {
        this.dataTO = dataTO;
    }

    public int getEmkost() {
        return emkost;
    }

    public void setEmkost(int emkost) {
        this.emkost = emkost;
    }
}

