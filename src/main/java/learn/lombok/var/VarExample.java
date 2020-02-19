package learn.lombok.var;

import java.util.ArrayList;

import lombok.var;

public class VarExample {

    public static String example() {
        var example = new ArrayList<String>();
        example.add("Hello, World!");


        example = new ArrayList<>();
        example.add("not final");
        // example = new LinkedList<String>();
        // doesn't work, type was inferred from initializer expression

        var foo = example.get(0);
        return foo.toLowerCase();
    }

    public static void main(String[] args) {
        System.out.println(example());
    }

}
