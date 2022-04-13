import sticker.Animal;
import sticker.Color;
import sticker.NushInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {


    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик", 4, Color.Синий);
        Cat cat2 = Cat.copy(cat1);


        cat1.setAge(15);

        System.out.println(cat2.getAge());


    }

}