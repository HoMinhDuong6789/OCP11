package c1.static_final;

public abstract class Cat {
    protected static String name = "The Cat";

    public static void eat() {
        System.out.println("Fish");
    }

    public final void sleep() {
        System.out.println("Sleeping");
    }
}
