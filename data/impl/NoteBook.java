package HWSem4OOP.data.impl;

import HWSem4OOP.data.Memory;
import HWSem4OOP.data.Computer;

public class NoteBook extends Computer {

    private Integer batteryCapacity;

    public NoteBook(String id, String model, Memory memory, String ssd, Integer batteryCapacity) {
        super(id, model, memory, ssd);
        this.batteryCapacity = batteryCapacity;
    }

    public Integer getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(Integer batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "id=" + getId() +
                "; модель=" + getModel() +
                "; оперативка=" + getMemory() +
                "; объем диска=" + getSsd() +
                "; емкость батареи=" + batteryCapacity +
                '}';
    }
}
