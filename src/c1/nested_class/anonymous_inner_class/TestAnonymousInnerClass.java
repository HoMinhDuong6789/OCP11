package c1.nested_class.anonymous_inner_class;

public class TestAnonymousInnerClass {
    public abstract class Animal {
        abstract String eat();
    }

    public String getFood() {
        Animal animal = new Animal() {
            @Override
            String eat() {
                return "meat";
            }
        };

        return "water and " + animal.eat();
    }

    interface Moveable {
        void move();
    }

    public void move() {
        Moveable moveable = new Moveable() {
            @Override
            public void move() {
                System.out.println("moving");
            }
        };

        moveable.move();
    }

    public void print(Animal animal) {
        System.out.println(animal.eat());
    }

    public void test() {
        print(new Animal() {
            String eat() {
                return "tomato";
            }
        });
    }

    public static void main(String[] args) {
        TestAnonymousInnerClass test = new TestAnonymousInnerClass();
        System.out.println(test.getFood());
        test.move();
        test.test();
    }
}
