package learn.lombok.nonNull;

import lombok.NonNull;

public class NonNullParent {

    protected String name;

    static class Person {

        String name;

        public String getName() {
            return name;
        }

    }

    public NonNullParent(@NonNull String name) {
        this.name = name;
    }

}
