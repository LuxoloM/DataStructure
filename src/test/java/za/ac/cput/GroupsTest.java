package za.ac.cput;

import org.junit.Test;

import static org.junit.Assert.*;

public class GroupsTest {

    Groups gr1 = new Groups();
    Groups gr2 = new Groups("David", "567890");



    @Test
    public void map() {
        Groups map1 = new Groups("Yolanda", "111213");
        Groups map2 = new Groups("Luxolo", "141516");

        gr1.map(map1);
        gr1.map(map2);

        gr1.displayMap("Luxolo");
        gr1.displayMap("Yolanda");

        gr1.deleteMap("Yolanda");
    }



    @Test
    public void set() {
        gr1.set("Bob");
        gr1.set("Phumza");
        gr1.set("54321");
        gr1.displaySet();
    }



    @Test
    public void removeSet() {
        gr1.set("Bob");
        gr1.set("Phumza");
        gr1.removeSet();
    }

    @Test
    public void list() {
        gr1.list(1);
        gr1.list(2);
        gr1.list(3);
        gr1.displayList();
    }

    @Test
    public void removeList() {
        gr1.list(1);
        gr1.list(2);
        gr1.list(3);
        gr1.removeList();
    }

}