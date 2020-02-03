package learn.lombok.to.string;

import lombok.ToString;

@ToString
public class ToStringExample {

    private final String name;
    private final Shape shape = new Square(5, 10);
    private String[] tags;
    @ToString.Exclude
    private final int id = 1;
    public static int dontPrint = 42;

    public ToStringExample(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @ToString(callSuper = true, includeFieldNames = false)
    public static class Shape {
        private final String name = "shape";
    }

    @ToString(callSuper = true, includeFieldNames = true)
    public static class Square extends Shape {
        private final int width, height;

        public Square(int width, int height) {
            this.width = width;
            this.height = height;
        }
    }

    public static void main(String[] args) {
        System.out.println(new ToStringExample("example"));
    }

}
