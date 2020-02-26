package learn.lombok.builder;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;

import java.util.Set;

@ToString
@Builder
public class BuilderExample {
    @Builder.Default
    private long created = System.currentTimeMillis();
    private String name;
    private int age;
    @Singular
    private Set<String> occupations;


    public static void main(String[] args) {
        System.out.println(BuilderExample.builder()
                .age(42)
                .build());
    }

}