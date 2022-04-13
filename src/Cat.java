import sticker.Animal;
import sticker.Color;
import sticker.NushInterface;

public class Cat extends Animal implements Comparable<Cat> {
    public Color color;

    public Cat(String name, int age, Color color) {
        super(name, age);
        this.color = color;
    }

    public static Cat copy(Cat cat) {
        return new Cat(cat.name, cat.age, cat.color);
    }

    @Override
    public void voice() {
        System.out.println(name + " говорит \"Мяу\"");

        hvost = "длинный";
    }

    @Override
    public String toString() {
        return "Кот по имени " + name + ", ему " + age + " лет";
    }


    @Override
    public int compareTo(Cat o) {
        return this.age.compareTo(o.age) * -1;
    }

    public void print() {
        System.out.println(this);
    }
}
