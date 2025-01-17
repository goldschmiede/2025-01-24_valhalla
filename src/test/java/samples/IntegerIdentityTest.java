package samples;

import static org.assertj.core.api.Assertions.*;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.junit.jupiter.api.Test;

public class IntegerIdentityTest {
    private final Random rnd = ThreadLocalRandom.current();
    private final int x = rnd.nextInt();

    @Test
    void check1() {
        assertThat(new Integer(x) == new Integer(x)).isTrue();
    }

    @Test
    void check2() {
        assertThat(Integer.valueOf(x) == Integer.valueOf(x)).isTrue();
    }
    
    @Test
    void check3() {
        assertThat(new Integer(x) == x).isTrue();
    }

    @Test
    void check4() {
        assertThat(Integer.valueOf(x) == x).isTrue();
    }
}
