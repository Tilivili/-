package VendingMachine;

public class Main {
    public static void main(String[] args){
        int id = 0;
        Product product1 = new Product(id++,"twix",90);
        Bottle product2 = new Bottle(id++,"coca-cola",120,2);
        Product product3 = new Product(id++,"lays",100);
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);
        vendingMachine.addProduct(product3);
        System.out.println(vendingMachine);
    }
}