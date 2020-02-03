package learn.lombok;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SetGetClassExample {

    private Long id;
    private String something;
    // no setter and getter because static
    private static int counter;
    // no setter for this
    @Setter(AccessLevel.NONE)
    private String dontGenerate;

}
