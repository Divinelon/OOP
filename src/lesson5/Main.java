package lesson5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();

       for(int i = 0 ; i < 15;i++)
           list.add(i);

       ListIterator <Integer> listIterator = list.listIterator();

       while(listIterator.hasNext())
       {

           System.out.print(list);
       }
    }
}
