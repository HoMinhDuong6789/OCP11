package c1.nested_class.member_inner_class.other_package;

import c1.nested_class.member_inner_class.base.Outer;

public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();

        // Compile error: can't create inner because Inner is default
        //Outer.Inner inner = outer.new Inner();
    }
}
