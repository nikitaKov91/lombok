package learn.lombok.equals.hashcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualsAndHashCodeExampleTest {

    @Test
    void equalsHashCodeTest() {
        final EqualsAndHashCodeExample example = new EqualsAndHashCodeExample("test");
        assertEquals(example, new EqualsAndHashCodeExample("test"));
        assertNotEquals(example, new EqualsAndHashCodeExample("another one"));
    }

    @Test
    void equalsNestedClass() {
        final EqualsAndHashCodeExample.Square example = new EqualsAndHashCodeExample.Square(10, 10);
        assertEquals(example, new EqualsAndHashCodeExample.Square(10, 10));
        assertNotEquals(example, new EqualsAndHashCodeExample.Square(42, 42));
    }

}