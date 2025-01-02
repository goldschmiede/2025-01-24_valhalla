package samples;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValueClassesTest {

    @Test
    void test() {
        var red1 = new Color(200, 12, 10);
        var red2 = new Color(200, 12, 10);
        Assertions.assertThat(red1 == red2).isTrue();
    }

}
