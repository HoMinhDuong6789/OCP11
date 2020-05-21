package c1.access_modifier.cat.species;

import c1.access_modifier.cat.BigCat;

public class Lynx extends BigCat {
    public static void main(String[] args) {
        BigCat cat = new BigCat();
        System.out.println(cat.name);

        // Compile error because hasFur is project - allow subclasses and code in the same package to access
        // But cat is not Lynx -> not accessed via inheritance
        // Lynx lynx = new Lynx() -> lynx.hasFur is true
        //System.out.println(cat.hasFur);

        // Compile error because hasPaws is default - can't access from other package
        //System.out.println(cat.hasPaws);

        // Compile error because id is private - just access in BigCat
        //System.out.println(cat.id);
    }
}
