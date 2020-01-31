import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicExampleTest {

    @Test
    void create() {

        BasicExample basicExample = new BasicExample();
        final long id = 0L;
        basicExample.setId(id);
        assertEquals(id, basicExample.getId());
        final String newName = "New name";
        basicExample.setName(newName);
        assertEquals(newName, basicExample.getName());
        System.out.println(basicExample.toString());
        assertEquals("BasicExample(id=" + id + ", name=" + newName + ")", basicExample.toString());
    }


}