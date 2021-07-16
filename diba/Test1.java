package diba;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<>();
        c1.add("one");
        c1.add("two");
        c1.add("three");
        System.out.println("c1 = " + c1);
        ArrayList<String> c2 = new ArrayList<>();
        c2.add("four");
        c2.add("five");
        c2.add("six");
        System.out.println("c2 = " + c2);
        c1.addAll(c2);
        System.out.println("c1 = " + c1);
        ArrayList<String> c3 = new ArrayList<>();
        c3.add("one");
        c3.add("five");
        System.out.println("c3 = " + c3);
        boolean a = c1.containsAll(c3);
        System.out.println("a = " + a);
        c1.remove("two");
        System.out.println("c1 = " + c1);
    }
}
