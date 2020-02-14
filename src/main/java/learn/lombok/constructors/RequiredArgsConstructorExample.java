package learn.lombok.constructors;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
public class RequiredArgsConstructorExample {

    private final boolean isBad;
    @NonNull
    private final String name;

    public static void main(String[] args) {
        System.out.println(new RequiredArgsConstructorExample(false, null));
    }

}
