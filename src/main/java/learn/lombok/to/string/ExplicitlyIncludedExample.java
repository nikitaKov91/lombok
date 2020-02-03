package learn.lombok.to.string;

import lombok.ToString;

@ToString(onlyExplicitlyIncluded = true)
public class ExplicitlyIncludedExample {

    private final int id = 0;
    @ToString.Include
    private final String name = "my name";
    private final String info = "some info";

    // Only instance (non-static) methods
    @ToString.Include(name = "print info", rank = 1)
    private String addPrintInfo() {
        return info + " to print";
    }


    public static void main(String[] args) {
        System.out.println(new ExplicitlyIncludedExample());
    }

}
