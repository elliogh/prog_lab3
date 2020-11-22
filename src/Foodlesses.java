public class Foodlesses {
    protected String name;
    protected static String status = "Нееловецы";
    protected static String city = "Нееловка";

    Foodlesses(String name) {
        this.name = name;
    }
    static void simpleTalk1(String name) {
        System.out.println(status + ": Как дела," + name + "?");
    }
    static void simpleTalk2(String name) {
        System.out.println(status + ": Как тебя к нам занесло," + name + "?");
    }
    static void toTell(String name) {
        System.out.println("Кстати, мы посадили гигантские семена - сказали нееловцы " + name + "у");
    }
    static void toShow(String name) {
        System.out.println("Нееловцы отвели " + name + "а" + " и показали первые всходы " + Seeds.Apple.getCode() + ", "
                                                                                          + Seeds.Melon.getCode() + ", "
                                                                                          + Seeds.Peach.getCode() + ", "
                                                                                          + Seeds.Potato.getCode() + ", "
                                                                                          + Seeds.Tomato.getCode()
        );
    }
}
