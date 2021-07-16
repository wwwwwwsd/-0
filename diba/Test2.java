package diba;

import java.util.ArrayList;
import java.util.Iterator;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> coll = new ArrayList<>();
        coll.add("1");
        coll.add("$");
        coll.add("2");
        coll.add("$");
        coll.add("3");
        coll.add("$");
        coll.add("4");
        System.out.println("coll = " + coll);

        Iterator<String> c=coll.iterator();
        while (c.hasNext()){
            if("$".equals(c.next())){
                c.remove();
            }

        }
        System.out.println("coll = " + coll);
    }

}
