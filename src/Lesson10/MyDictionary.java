package Lesson10;


import java.util.HashMap;
import java.util.Map;

public class MyDictionary <K,V> {
    Map<K,V> map = new HashMap<K,V>();

    public Map<K,V> getMap(){
        return map;
    }

    public void add(K k,V v){
        map.put(k,v);
    }
    public V index(K k){
        return map.get(k);
    }

    public int count(){
        return map.size();
    }

    public static void main(String[] args) {
        MyDictionary<String,String> stringStringMyDictionary = new MyDictionary<>();
        stringStringMyDictionary.add("1","Hello");
        stringStringMyDictionary.add("2","World");

        System.out.println(stringStringMyDictionary.getMap());
        System.out.println(stringStringMyDictionary.index("1"));
        System.out.println(stringStringMyDictionary.count());
    }

}
