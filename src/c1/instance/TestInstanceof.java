package c1.instance;

class HeavyAnimal { }

class Hippo extends HeavyAnimal { }

class Elephant extends HeavyAnimal { }

interface Mother {}

public class TestInstanceof {
    public static void main(String[] args) {
        HeavyAnimal hippo = new Hippo();
        System.out.println(hippo instanceof Hippo);
        System.out.println(hippo instanceof HeavyAnimal);
        System.out.println(hippo instanceof Elephant);
        System.out.println(hippo instanceof Object);
        // Compiler check only applies when instanceof is called on a class
        // With interface, wait until runtime to do
        System.out.println(hippo instanceof Mother);

        System.out.println("----------------------------------");

        hippo = null;
        System.out.println(hippo instanceof Hippo);
        System.out.println(hippo instanceof HeavyAnimal);
        System.out.println(hippo instanceof Object);

        System.out.println("----------------------------------");

        Hippo hippo1 = new Hippo();
        System.out.println(hippo1 instanceof Object);
        System.out.println(hippo1 instanceof Hippo);
        System.out.println(hippo1 instanceof HeavyAnimal);
        // Compile Error
        //System.out.println(hippo1 instanceof Elephant);
    }
}
