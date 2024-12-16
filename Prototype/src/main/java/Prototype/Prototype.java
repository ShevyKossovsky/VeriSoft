package Prototype;

public abstract class Prototype implements Cloneable {


    @Override
    public abstract Prototype clone();

    public abstract void display();

}
