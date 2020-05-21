package c1.enums;

enum Month {
    JANUARY("Low"), FEBRUARY("High"), MARCH("Medium"), APRIL("Low");
    private String expectedVisitors;

    private Month(String expectedVisitors) {
        System. out .println("constructing");
        this.expectedVisitors = expectedVisitors;
    }

    public void printExpectedVisitors() {
        System.out.println(expectedVisitors);
    }
}

enum Season1 {
    WINTER{
        public void printHours() { System. out .println("9am-3pm"); }
        public void printDefaultHours() { System.out.println("short hours"); }
    }, SPRING{
        public void printHours() { System. out .println("9am-5pm"); }
        public void printDefaultHours() { System.out.println("long hours"); }
    }, SUMMER{
        public void printHours() { System. out .println("9am-7pm"); }
    }, FALL{
        public void printHours() { System. out .println("9am-5pm"); }
    };
    public abstract void printHours();
    public void printDefaultHours() { System.out.println("default hours"); }

}

public class TestMonth {
    public static void main(String[] args) {
        Month month = Month.APRIL;
        System.out.println(month);
        month.printExpectedVisitors();

        Month month1 = Month.JANUARY;
        System.out.println(month1);

        Season1 s1 = Season1.WINTER;
        s1.printHours();
        s1.printDefaultHours();

        Season1 s2 = Season1.FALL;
        s2.printHours();
        s2.printDefaultHours();
    }
}
