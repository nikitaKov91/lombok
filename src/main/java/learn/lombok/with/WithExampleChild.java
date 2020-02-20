package learn.lombok.with;

public class WithExampleChild extends WithExample {

    public WithExampleChild(String name, int age) {
        super(name, age);
    }

    public static void main(String[] args) {
        WithExample child = new WithExampleChild("name", 42)
                .withName("new");
        System.out.println(child);
    }

}
