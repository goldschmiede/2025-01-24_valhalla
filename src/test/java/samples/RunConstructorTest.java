package samples;

import org.junit.jupiter.api.Test;

public class RunConstructorTest {

    @Test
    void runIdentityTest() {
        new IdentityTest(1, 2);
    }

    @Test
    void runValueTest() {
        new ValueTest(1, 2);
    }
}
