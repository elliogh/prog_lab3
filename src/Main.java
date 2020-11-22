import java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Donut donut = new Donut("Пончик", 100, 20, 2002);
        Crumb crumb = new Crumb("Мякиш",70, 20, 2000);
        donut.toChase(crumb.getName()+"а");
        crumb.toSuspect(donut.getName());
        crumb.tryToEscape();
        Car car = new Car("Mercedes-benz", (int)(1 + Math.random()) * 200, 60);
        Driver driver = new Driver("Арсен");
        driver.increaseSpeed();
        car.speed += (int)(1 + Math.random() * 10);
        crumb.toEscape();
        car.comeToDestination(crumb.getName(), Foodlesses.city);
        System.out.println();
        Foodlesses.simpleTalk1(crumb.getName());
        crumb.simpleAnswer1();
        Foodlesses.simpleTalk2(crumb.getName());
        crumb.simpleAnswer2();
        Foodlesses.toTell(crumb.getName());
        System.out.println();
        Foodlesses.toShow(crumb.getName());
        crumb.toCry();
    }
}
