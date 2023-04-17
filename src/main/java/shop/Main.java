package shop;

public class Main {
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

        Discountable.printEveryDiscountAvailableForAProduct();

    }

}
