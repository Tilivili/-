package VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> productList;

    public VendingMachine() {
        productList = new ArrayList<>();
    }

    public void addProduct(Product product){
        productList.add(product);
    }
    public Product getByName(String name){
        for (Product product: productList){
            if (product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }
    public Product getById(int idProduct){
        for (Product product: productList){
            if (product.getId() == idProduct){
                return product;
            }
        }
        return null;
    }
    public String getProductListInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список продуктов: \n");
        for (Product product: productList){
            stringBuilder.append(product);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString(){
        return getProductListInfo();
    }
}

