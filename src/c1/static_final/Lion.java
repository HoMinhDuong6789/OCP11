package c1.static_final;

public class Lion extends Cat{
    public void printInfo() {
        System.out.println(this.name + " : " + super.name);
    }

    public static void eat() {
        System.out.println("Meat");
    }

    public static void main(String[] args) {
        Lion lion = new Lion();
        System.out.println(lion.name);
        lion.printInfo();
        lion.sleep();
    }
}
