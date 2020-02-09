package learn.lombok.equals.hashcode;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ExplicitlyIncludedExample {

    private final String name = "Great name";
    @EqualsAndHashCode.Include
    private final int id = 1;

}
