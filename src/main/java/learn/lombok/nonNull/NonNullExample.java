package learn.lombok.nonNull;

import lombok.NonNull;
import lombok.ToString;

@ToString
public class NonNullExample extends NonNullParent {

    public NonNullExample(@NonNull Person person) {
        super(null);
        this.name = person.getName();
    }

    public static void main(String[] args) {
        System.out.println(new NonNullExample(new Person()));
    }

}
