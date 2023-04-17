package shop;

import java.util.Arrays;

public abstract class Customer extends Person implements Discountable{
    private Product[]products;
    private Size size;



    public Customer(String name , Product[] products, Size size) {
        super(name);
        this.size=size;
this.products= products;
    }


    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "products=" + Arrays.toString(products) +
                ", size=" + size +
                '}';
    }

    @Override
    public double calculateDiscount(Product price) {
        return price.getPrice() ;
    }
}
