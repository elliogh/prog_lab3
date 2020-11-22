public class Driver {
    String name;
    String status = "Водитель";

    Driver(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return this.status + " " + this.name;
    }
    void increaseSpeed () {
        System.out.println(toString() + " прибавил скорость");
    }
}
