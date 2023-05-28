package pe.edu.upc.backup.dtos;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class LenguajeDTO {
    private int id;
    private String descrip;
    private String abrev;
    private String tipoLeng;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDesc(String descrip) {
        this.descrip = descrip;
    }

    public String getAbrev() {
        return abrev;
    }

    public void setAbrev(String abrev) {
        this.abrev = abrev;
    }

    public String getTipoLeng() {
        return tipoLeng;
    }

    public void setTipoLeng(String tipoLeng) {
        this.tipoLeng = tipoLeng;
    }
}
