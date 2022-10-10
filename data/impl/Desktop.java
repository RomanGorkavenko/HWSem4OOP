package HWSem4OOP.data.impl;

import HWSem4OOP.data.Memory;
import HWSem4OOP.data.Computer;

public class Desktop extends Computer {

    private Integer powerSupply;

    public Desktop(String id, String model, Memory memory, String ssd, Integer powerSupply) {
        super(id, model, memory, ssd);
        this.powerSupply = powerSupply;
    }

    public Integer getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(Integer powerSupply) {
        this.powerSupply = powerSupply;
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "id=" + getId() +
                "; модель=" + getModel() +
                "; оперативка=" + getMemory() +
                "; объем диска=" + getSsd() +
                "; мощность блока питания=" + powerSupply +
                '}';
    }
}
