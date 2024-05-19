package lab06.ex1p5;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String toString() {
        return String.format("Animal[name = %s]", name);
    }
}
