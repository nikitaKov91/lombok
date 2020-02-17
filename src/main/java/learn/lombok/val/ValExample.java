package learn.lombok.val;

import java.util.ArrayList;
import java.util.HashMap;

import lombok.val;

public class ValExample {

    public static String example() {
        val example = new ArrayList<String>();
        example.add("Hello, World!");
        val foo = example.get(0);
        return foo.toLowerCase();
    }

    public static void example2() {
        val map = new HashMap<Integer, String>();
        map.put(0, "zero");
        map.put(5, "five");
        // map = new HashMap<Integer, String>(); final, doesn't work
        for (val entry : map.entrySet()) {
            System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
        }
    }

    public static void main(String[] args) {
        System.out.println(example());
        example2();
    }

}
