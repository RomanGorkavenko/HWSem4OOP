package HWSem4OOP.service;

import HWSem4OOP.data.Computer;

import java.util.List;

public interface Printable<T extends Computer> {
    public void print (List<T> list);
}
