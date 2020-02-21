package learn.lombok.value;

import learn.lombok.Synchronized.SynchronizedExample;
import lombok.*;
import lombok.experimental.NonFinal;

@Value
public class ValueExample {

    String name;
    @With(AccessLevel.PACKAGE)
    @NonFinal
    int age;
    double score;
    protected String[] tags;

    @NonFinal
    @ToString(includeFieldNames = true)
    @Value(staticConstructor = "of")
    public static class Exercise<T> {
        String name;
        T value;
    }

    public static class ExerciseNext<T> extends Exercise<T> {

        private ExerciseNext(String name, T value) {
            super(name, value);
        }

    }


    public static void main(String[] args) {
        ValueExample valueExample = new ValueExample("name", 42, 100, null)
                .withAge(45);
        System.out.println(valueExample);
        Exercise<String> exercise = Exercise.of("name", "value");
        System.out.println(exercise);
    }

}