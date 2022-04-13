package sticker;


import java.io.Serializable;

public class Dog implements NushInterface, Serializable, Comparable, Runnable {

    public Dog(String name, int age) {

    }

//    @Override
//    public void voice() {
//        super.voice();
//        System.out.println(" Гав");
//    }
//
//    public void dig(){
//        System.out.println(name + " копает");
//
//
//    }

    @Override
    public int sravnivaem(Animal animal) {
        return 0;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public void run() {

    }
}
