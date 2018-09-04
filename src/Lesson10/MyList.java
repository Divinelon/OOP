package Lesson10;

import java.util.ArrayList;
import java.util.List;

class MyList<T> {
List<T> list = new ArrayList<>();
    public List<T> getList() {
        return list;
    }

public void addElement(T t){
    list.add(t);
}

public int index(T t){
    return list.indexOf(t);
}

public int listCoint(){
    return list.size();
}

    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.addElement("Hello");
        list.addElement("World");
        System.out.println(list.getList());
        System.out.println(list.index("Hello"));
        System.out.println(list.listCoint());
    }
}
