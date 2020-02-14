package learn.lombok.nonNull;

import lombok.NonNull;

public class NonNullFlagExample {

    private String name;

    public NonNullFlagExample(@NonNull String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println(new NonNullExample(new NonNullParent.Person()));
    }

}
