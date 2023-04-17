package shop;

public  class Student extends Customer{
    private long studentID;
    private final double DISCOUNT = 0.05;

    public Student(String name , Product[] products, Size size) {
        super(name , products , size);
        this.studentID = studentID;
    }
//    public Student(String name){
//        super(name);
//
//    }


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
