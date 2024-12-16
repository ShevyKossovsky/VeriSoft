package Prototype;

public class Bunny extends Prototype {
    private String color;
    private String size;

    public Bunny(String color, String size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public Prototype clone() {
        return new TeddyBear(this.color, this.size);
    }

    @Override
    public void display() {
        System.out.println("TeddyBear [Color: " + color + ", Size: " + size + "]");
    }
}
