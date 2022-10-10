package HWSem4OOP.controller.impl;

import HWSem4OOP.controller.ComputerController;
import HWSem4OOP.data.impl.Desktop;
import HWSem4OOP.service.impl.DesktopService;

import java.util.List;

public class DesktopController extends ComputerController<Desktop> {
    private final DesktopService desktopService;

    public DesktopController() {
        this.desktopService = new DesktopService();
    }

    public void printDesktop(List<Desktop> desktops){
        desktopService.print(desktops);
    }
    public List<Desktop> desktopList(){
        return desktopService.desktopList();
    }
    public List<Desktop> inputPowerSupply(List<Desktop> list){
        String question = "Выберите мощность блока питания 350, 650, 800." +
                "\nНапишите значение из списка выше.";
        int powerSupply = inputNumber(question);
        return desktopService.filterPowerSupply(powerSupply, list);
    }

}
