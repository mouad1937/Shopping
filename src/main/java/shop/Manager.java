package shop;

public  class Manager extends Employee implements Discountable{
    private final double DISCOUNT=0.05;


    public Manager(String name , Product[] products, Size size) {
        super(name, products, size);

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
        System.out.println(getName());
    }


}
