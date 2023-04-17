package shop;

public  class Business implements Discountable {
    private String address;
    private Product product;
    private final double DISCOUNT =0.25;

    public Business(String address, Product product) {
        this.address = address;
        this.product = product;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


    @Override
    public double calculateDiscount(Product product) {
        return 0;
    }

    @Override
    public boolean isEligibleForDiscount(Product product) {
        return false;
    }

    @Override
    public String getDiscountDescription() {
        return null;
    }

    @Override
    public void printPersonName() {
    }


    @Override
    public String toString() {
        return "Business{" +
                "address='" + address + '\'' +
                ", product=" + product +
                '}';
    }
}
