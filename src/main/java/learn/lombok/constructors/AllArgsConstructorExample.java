package learn.lombok.constructors;

import lombok.*;

@ToString
@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class AllArgsConstructorExample<T> {

    // no annotation - no parameter in constructor
    private boolean isBad;
    @NonNull
    private final int x, y;
    @NonNull
    private final T description;

    public static void main(String[] args) {
        System.out.println(AllArgsConstructorExample.of(0, 1, "description"));
    }

}
