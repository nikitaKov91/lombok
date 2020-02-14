package learn.lombok.constructors;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(force = true)
@ToString
public class NoArgsConstructorForceExample {

    private final boolean isBad;
    private final int x, y;
    private final String name = "Experiment";

    public static void main(String[] args) {
        System.out.println(new NoArgsConstructorForceExample());
    }

}
