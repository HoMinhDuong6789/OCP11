package c1.nested_class.member_inner_class.base;

public class Outer {
    private String greeting = "Hi";

    class Inner {
        private int repeat = 3;
        public void go() {
            for (int i = 0; i < repeat; i++) {
                System.out.println(greeting);
            }
        }
    }

    public void callInner() {
        Inner inner = new Inner();
        inner.go();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.callInner();

        Inner inner = outer.new Inner();
        inner.go();
    }
}
