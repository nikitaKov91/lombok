package learn.lombok.Synchronized;

import lombok.Synchronized;
import lombok.var;

public class SynchronizedExample {

    private final Object readLock = new Object();

    @Synchronized
    public static void hello() {
        System.out.println("world");
    }

    @Synchronized
    public int answerToLife() {
        return 42;
    }

    @Synchronized("readLock")
    public void foo() {
        System.out.println("bar");
    }

    public static void main(String[] args) {
        SynchronizedExample example = new SynchronizedExample();
        for (var i = 0; i < 10; i++) {
            new Thread(() -> {
                hello();
                System.out.println(example.answerToLife());
                example.foo();
            }).start();
        }
    }

}
