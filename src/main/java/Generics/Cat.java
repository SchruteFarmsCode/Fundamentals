package Generics;

import java.util.Comparator;
import java.util.Objects;

public class Cat implements Comparable<Cat> {
    private int weight;
    private String name;

    public Cat(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return weight == cat.weight && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, name);
    }

    @Override
    public int compareTo(Cat o) {
        return 0;
    }
}
