import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class subNumbersTest {
    @Test
    void subShouldReturn2(){
        var subTest = new subNumbers();
        assertEquals(2, 4,2);
    }
    @Test
    void subShouldReturnNeg4(){
        var subTest = new subNumbers();
        assertEquals(-4, 2, 6);
    }
}