package learn.lombok.getterLazy;

import lombok.Getter;
import lombok.val;
import lombok.var;

public class GetterLazyExample {

    @Getter(lazy = true)
    private final double[] cached = expensive();

    private double[] expensive() {
        double[] result = new double[1000000];
        for (int i = 0; i < result.length; i++) {
            result[i] = Math.asin(i);
        }
        return result;
    }

    public static void main(String[] args) {
        val example = new GetterLazyExample();
        var startTime = System.nanoTime();
        var cached = example.getCached();
        var endTime = System.nanoTime();
        System.out.println("Duration (first time): " + (endTime - startTime));

        startTime = System.nanoTime();
        cached = example.getCached();
        endTime = System.nanoTime();
        System.out.println("Duration (second time): " + (endTime - startTime));
    }

}
