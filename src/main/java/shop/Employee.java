package shop;

public abstract class Employee extends Customer{
    protected final double DISCOUNT=0.1;

    public Employee(String name , Product[] products, Size size) {
        super(name , products, size);

    }


    public void printEmployeePriceAfterDiscount(Product product){
        double price=0;
        System.out.println(price -( price *  DISCOUNT));
    }


}
