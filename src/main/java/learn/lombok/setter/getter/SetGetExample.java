package learn.lombok.setter.getter;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class SetGetExample {

    @Getter
    @Setter
    private int age = 18;

    @Getter(AccessLevel.PROTECTED)
    @Setter(AccessLevel.PROTECTED)
    private String name;

    @Getter(AccessLevel.PACKAGE)
    @Setter(AccessLevel.PACKAGE)
    private Long lvl;

}
