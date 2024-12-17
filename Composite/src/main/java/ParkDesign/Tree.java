package ParkDesign;

import java.util.ArrayList;
import java.util.List;

public class Tree implements ParkElement {
    private List<ParkElement> parkElements;

    Tree() {
        this.parkElements = new ArrayList<ParkElement>();
    }

    @Override
    public void addElement(ParkElement element) {
        this.parkElements.add(element);
    }

    @Override
    public void removeElement(ParkElement element) {
        this.parkElements.remove(element);
    }
}
