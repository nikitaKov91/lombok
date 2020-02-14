package learn.lombok.constructors;

import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
public class NoArgsConstructorExample {

    private boolean isBad;
    private int x, y;
    private String name;

    public static void main(String[] args) {
        System.out.println(new NoArgsConstructorExample());
    }

}
