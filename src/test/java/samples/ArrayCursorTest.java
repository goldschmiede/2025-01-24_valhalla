package samples;

import static org.assertj.core.api.Assertions.*;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

public class ArrayCursorTest {


    @Test
    void demo() {
        Integer[] array = IntStream.rangeClosed(1, 10).boxed().toList().toArray(new Integer[0]);
        for (ArrayCursor<Integer> c = new ArrayCursor<>(array, 0); 
                c.hasNext(); 
                c = c.advance()) {
            System.out.println(c.next());
        }

        assertThat(new ArrayCursor<>(array, 0)).isInstanceOf(ValueObject.class);
    }
}
