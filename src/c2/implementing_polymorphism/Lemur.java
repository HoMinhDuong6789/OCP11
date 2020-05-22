package c2.implementing_polymorphism;

class Primate {
    public boolean hasHair() {
        return true;
    }
}

interface HasTail {
    public boolean isTailStriped();
}

public class Lemur extends Primate implements HasTail {
    public int age = 10;
    public boolean isTailStriped() {
        return false;
    }
    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);
        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());
        //System.out.println(hasTail.age);
        Primate primate = lemur;
        System.out.println(primate.hasHair());
        //primate.isTailStriped();
    }
}
