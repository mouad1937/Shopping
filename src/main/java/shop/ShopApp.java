package shop;

public class ShopApp {


        public static void printPersonName(Person name){
            System.out.println(name);
        }

        public  double calculateTotal(Product[] products){
            double total = 0.0;

            for (Product product : products) {
                total += product.getPrice();}

            return total;
}
        public boolean isAFit(Customer customer, Product product){
            if (customer.getSize().equals(product.getSize())) {
                return true;
            } else {
                return false;
            }
        }

        public void printEveryDiscountAvailableForAProduct(Discountable[] discountable1, Product product){
            for (Discountable discountable : discountable1) {
                if (discountable.isEligibleForDiscount(product)) {
                    System.out.println(discountable.getDiscountDescription());
                }
            }
        }
}
























