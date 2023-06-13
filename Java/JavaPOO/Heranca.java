package JavaPOO;

class Heranca {
    protected String brand = "Fiat";
    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}    

class Car extends Heranca {
    private String modelName = "Fastback";
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}