import java.util.Objects;

public class Crumb extends Human implements CrumbActions{

    Crumb(String name, int weight, int height, int birthYear) {
        super(name, weight, height, birthYear);
    }

    @Override
    public String toString() {
        return this.name + " " + this.birthYear + " года рождения ";
    }
    @Override
    public boolean equals(Object o){
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()){
            return false;
        }
        Crumb cr = (Crumb) o;
        return Objects.equals(name, cr.name) &&
                Objects.equals(birthYear, cr.birthYear);
    }
    @Override
    public int hashCode (){
        return Objects.hash(name, weight, height, birthYear);
    }
    @Override
    public void toSuspect(String suspect) {
        System.out.println(this.name + " подозревает, что " + suspect + " следит за ним" );
    }
    @Override
    public void tryToEscape() {
        System.out.println(this.name +" пытается сбежать");
    }
    @Override
    public void toEscape(){
        System.out.println(this.name + " скрылся");
    }
    @Override
    public void simpleAnswer1(){
        System.out.println(this.name + ": Все отлично!");
    }
    @Override
    public void simpleAnswer2(){
        System.out.println(this.name + ": Я специально ехал к Вам, чтобы вы мне что-то показали");
    }
    @Override
    public void toCry() {
        System.out.println(this.name + " заплакал от радости");
    }
}
