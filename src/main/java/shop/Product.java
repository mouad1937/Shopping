package shop;

public class Product {
    private String description;
    private double price;
    private Size size;

    public Product(String description, double price, Size size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public double calculateTotal(Product[] products) {
        double total = 0.0;

        for (Product product : products) {
            total += product.getPrice();
        }

        return total;

    }
}
