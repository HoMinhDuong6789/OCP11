package c1.nested_class.member_inner_class.base;

public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();

        Outer.Inner inner = outer.new Inner();
        inner.go();
        //Compile error: repeat is private
        // System.out.println(inner.repeat);
    }
}
