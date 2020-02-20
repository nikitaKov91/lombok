package learn.lombok.with;

import lombok.AccessLevel;
import lombok.NonNull;
import lombok.ToString;
import lombok.With;

@ToString
public class WithExample {

    @With(AccessLevel.PROTECTED)
    @NonNull
    private final String name;
    @With
    private final int age;

    public WithExample(String name, int age) {
        if (name == null) throw new NullPointerException();
        this.name = name;
        this.age = age;
    }

}
