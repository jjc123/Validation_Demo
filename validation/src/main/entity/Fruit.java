package entity;

import groups.FruitsGroup1;
import groups.FruitsGroup2;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;


public class Fruit {
    @Size(min = 1,max = 3,message = "{name.length.error}",groups = {FruitsGroup1.class})
    private String name;
    @NotEmpty(message = "{adress.isEmpty}",groups = {FruitsGroup1.class,FruitsGroup2.class})
    private String adress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
