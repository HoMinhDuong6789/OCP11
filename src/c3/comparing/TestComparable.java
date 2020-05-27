package c3.comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Duck implements Comparable<Duck> {
    private String name;

    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public String toString() { // use readable output
        return name;
    }

    @Override
    public int compareTo(Duck d) {
        return name.compareTo(d.name); // call String's compareTo
    }
}

public class TestComparable {
    public static void main(String[] args) {
        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Quack", 7));
        ducks.add(new Duck("Puddles", 10));
        Collections.sort(ducks); // sort by name
        System.out.println(ducks); // [Puddles, Quack]

        Comparator<Duck> byWeight = new Comparator<Duck>() {
            public int compare(Duck d1, Duck d2) {
                return d1.getWeight() - d2.getWeight();
            }
        };
        Collections.sort(ducks, byWeight);
        System.out.println(ducks);   // [Quack, Puddles]
    }
}
