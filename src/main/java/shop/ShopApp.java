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


    public static void main(String[] args) {

Product shirt = new Product("Gucci",25.0, Size.SMALL);
Product pants = new Product("Nike", 30.0,Size.MEDIUM);
Product shoes = new Product("Amiri",45.0 ,Size.LARGE);
Product[] products={shirt,pants,shoes};
Manager manager = new Manager("Jack",products,Size.LARGE) ;
Student student= new Student("Amine", products,Size.MEDIUM);
Business business= new Business("300 Main Street",shoes );

        manager.printPersonName();
        student.printPersonName();
        System.out.println(business.toString());
        products.calculateTotal();
Discountable.printEveryDiscountAvailableForAProduct();

}


    }
























