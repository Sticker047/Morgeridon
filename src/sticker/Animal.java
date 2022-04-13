package sticker;

public abstract class Animal {

    public String name;
    protected Integer age;
    public String hvost;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void voice() {
        System.out.println(name + " говорит анималистично ");
    }

    public void some() {
        System.out.println("\nЯ статика");
    }

    public static boolean qwerty(int i) {
        return true;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 30) {
            System.out.println("Набран неадекватный возраст");
        }
        else {
            this.age = age;
        }
    }
}
