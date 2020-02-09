package learn.lombok.equals.hashcode;


import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class EqualsAndHashCodeExample {
    // not include
    private final transient int transientVar = 10;
    // not include
    private static final int staticVar = 42;
    private final String name;
    @EqualsAndHashCode.Exclude private final Shape shape = new Square(5, 10);
    private String[] tags;
    @EqualsAndHashCode.Exclude private int id;

    public EqualsAndHashCodeExample(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @EqualsAndHashCode
    public static class Shape {
        private final String name = "shape";
    }

    @EqualsAndHashCode(callSuper=true)
    public static class Square extends Shape {
        private final int width, height;

        public Square(int width, int height) {
            this.width = width;
            this.height = height;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Square(10, 10).equals(new Square(10, 10)));
    }

}