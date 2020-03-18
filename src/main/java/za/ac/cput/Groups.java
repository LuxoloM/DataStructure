package za.ac.cput;

import java.util.*;

public class Groups {

    String name;
    String studentNum;

    Map map = new HashMap();
    Set set = new HashSet();
    List list = new ArrayList();

    public Groups() {
    }

    public Groups(String name, String studentNum) {
        this.name = name;
        this.studentNum = studentNum;

    }


    public void map(Groups gr){
        map.put(gr.name, gr.studentNum);
    }

    public void displayMap(String t){
        String text =(String)map.get(t);
        System.out.println(t);
    }

    public void deleteMap(String t){
        map.remove(t);
        String element = (String)map.get(t);
        System.out.println(element);
    }

    public void set(String name){
        set.add(name);
    }

    public void displaySet(){
        System.out.println(set);
    }

    public void removeSet(){
        set.remove(0);
        System.out.println(set);
    }

    public void list(int x){
        list.add(x);
        System.out.println(x);

    }

    public void removeList(){
        list.remove(0);
    }

    public void displayList(){
        System.out.println(list);
    }

}
