package VendingMachine;

public class Bottle extends Product {
    private double volume;
    public Bottle(int id, String name, double price, double volume) {
        super(id,name,price);
        this.volume = volume;
    }



}