package learn.lombok.setter.getter;

import learn.lombok.setter.getter.SetGetExample;
import learn.lombok.setter.getter.SetGetExampleChild;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetGetExampleTest {

    @Test
    void setGetTest() {
        final String name = "child";
        SetGetExampleChild child = new SetGetExampleChild("child");
        assertEquals(name, child.getName());
    }
    
    @Test
    void setGetPackageTest() {
        final Long lvl = 10L;
        SetGetExample example = new SetGetExample();
        example.setLvl(lvl);
        assertEquals(lvl, example.getLvl());
    }
    
}