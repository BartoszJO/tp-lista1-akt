package technologiaprogramowania;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testClassAMessage() {
        ClassA classA = new ClassA();
        String messageA = classA.getMessage();
        assertEquals("To jest klasa ClassA", messageA);
    }

    @Test
    public void testClassBMessage() {
        ClassB classB = new ClassB();
        String messageB = classB.getMessage();
        assertEquals("To jest klasa ClassB", messageB);
    }
}
//