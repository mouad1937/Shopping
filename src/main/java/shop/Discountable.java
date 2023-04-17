package shop;

public interface Discountable {
    public double calculateDiscount(Product price);

    boolean isEligibleForDiscount(Product product);
    String getDiscountDescription();
//     double calculateTotal();
    void printPersonName( );
}
