import java.util.Objects;

public class Donut extends Human implements DonutActions {

    Donut(String name, int weight, int height, int birthYear) {
        super(name, weight, height, birthYear);
    }
    @Override
    public String toString() {
        return this.name + " " + this.birthYear + " года рождения ";
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Donut don = (Donut) o;
        return Objects.equals(name, don.name) &&
                Objects.equals(birthYear, don.birthYear) &&
                Objects.equals(weight, don.weight) &&
                Objects.equals(height, don.height);
    }
    @Override
    public void toChase(String name) {
        System.out.println(this.name + " преследует " + name);
    }
}
