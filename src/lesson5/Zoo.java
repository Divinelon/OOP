package lesson5;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Tiger");
        list.add("Lion");
        list.add("Bear");
        list.add("Penguin");
        list.add("Ostrich");
        list.add("Panda");
        list.add("Crocodile");
        list.add("Elephant");
        list.add("Monkey");
        list.add("Snake");

        System.out.println("Size bfore delete " + list.size());


        list.remove(2);
        list.remove(4);
        list.remove(6);

        for(Object o : list)
            System.out.println(o);

        System.out.println("Size after delete " + list.size());
    }
}
