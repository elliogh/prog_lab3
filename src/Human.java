abstract class Human {
    protected String  name;
    protected int weight;
    protected int height;
    protected int birthYear;

    Human(String name, int weight, int height, int birthYear) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.birthYear = birthYear;
    }
    String getName(){
        return name;
    }
}
