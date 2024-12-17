package ParkDesign;

import java.util.ArrayList;
import java.util.List;

public class FlowerBed implements ParkElement {

    private List<ParkElement> parkElements;

    FlowerBed() {
        parkElements = new ArrayList<>();
    }

    @Override
    public void addElement(ParkElement element) {
        parkElements.add(element);
    }

    @Override
    public void removeElement(ParkElement element) {
        parkElements.remove(element);
    }
}
