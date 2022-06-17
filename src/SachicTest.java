import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SachicTest {

    Sachic sachic = new Sachic();

    @Test
    public void add_테스트() {

        // given
        int a = 10;
        int b = 5;

        // when
        int result = sachic.add(a, b);

        // then
        assertEquals(15, result);

    }

    @Test
    public void sub_테스트() {

        // given
        int a = 10;
        int b = 5;

        // when
        int result = sachic.sub(a, b);

        // then
        assertEquals(5, result);
    }

    @Test
    public void mul_테스트() {

        // given
        int a = 10;
        int b = 5;

        // when
        int result = sachic.mul(a, b);

        // then
        assertEquals(50, result);
    }

    @Test
    public void div_테스트() {

        // given
        int a = 10;
        int b = 5;

        // when
        int result = sachic.div(a, b);

        // then
        assertEquals(2, result);
    }
}
