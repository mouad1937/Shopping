package shop;

public interface Discountable {
    static void printEveryDiscountAvailableForAProduct() {

    }

    public double calculateDiscount(Product price);

    boolean isEligibleForDiscount(Product product);
    String getDiscountDescription();
//     double calculateTotal();
    void printPersonName( );
}
