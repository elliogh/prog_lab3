public class Car {
    protected String model;
    protected int maxSpeed;
    protected int speed;

    Car(String model, int maxSpeed, int speed){
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.speed = speed;
    }
    void comeToDestination( String passenger, String city) {
        System.out.println(this.model + ", в котором ехал " + passenger + ", прибыл в " + city);
    }
}
