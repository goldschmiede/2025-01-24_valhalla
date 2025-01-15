package samples;

import static org.assertj.core.api.Assertions.*;

import java.util.Objects;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

public class ArrayCursorTest {

// tag::code[]
    @Test
    void demo() {
        Integer[] array = IntStream.rangeClosed(1, 10)
            .boxed().toList().toArray(new Integer[0]);
        for (ArrayCursor<Integer> c = new ArrayCursor<>(array, 0); 
                c.hasNext(); 
                c = c.advance()) {
            System.out.println(c.get());
        }
    }

    @Test
    void check() {
        Integer[] array = new Integer[0];
        var c = new ArrayCursor<>(array, 0); 

        assertThat(Objects.hasIdentity(c)).isFalse();
        assertThat(Objects.hasIdentity(Integer.valueOf(0))).isFalse();
        assertThat(Objects.hasIdentity("")).isTrue();
    }
// end::code[]
}
