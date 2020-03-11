package by.home.task;

import java.util.Date;

public class PriborKuhn extends Pribor {
    private String dataTO; //Дата следующего технического обслуживания
    private int emkost; //Масса или обьем загружаемых продуктов(посуды)

    public PriborKuhn(String namePrib, String modelPrib, int powerPrib, int groupNom, String dataTO,int emkost) {
        super(namePrib, modelPrib, powerPrib, groupNom);
        this.dataTO=dataTO;
        this.emkost=emkost;
    }

    public String getDataTO() {
        return dataTO;
    }

    public void setDataTO(String dataTO) {
        this.dataTO = dataTO;
    }

    public int getEmkost() {
        return emkost;
    }

    public void setEmkost(int emkost) {
        this.emkost = emkost;
    }
}

