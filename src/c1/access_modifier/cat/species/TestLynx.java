package c1.access_modifier.cat.species;

import c1.access_modifier.cat.BigCat;
import c1.access_modifier.cat.Lion;

public class TestLynx {
    public static void main(String[] args) {
        Lynx lynx = new Lynx();

        // Compile error
        //System.out.println(lynx.hasFur);

        BigCat cat = new BigCat();
        // Compile error
        //System.out.println(cat.hasFur);

        Lion lion = new Lion();
        System.out.println(lion.name);
        // Compile error
        //System.out.println(lion.hasFur);
        // Compile error
        //System.out.println(lion.hasPaws);
    }
}
