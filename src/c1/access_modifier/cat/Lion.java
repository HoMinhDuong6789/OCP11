package c1.access_modifier.cat;

public class Lion extends BigCat{
    public static void main(String[] args) {
        Lion lion = new Lion();
        System.out.println(lion.name);
        System.out.println(lion.hasFur);
        System.out.println(lion.hasPaws);
    }
}
