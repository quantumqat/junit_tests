import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class addNumbersTest {
    @Test
    public void addShouldReturn4(){
        var testAdd = new addNumbers();
        assertEquals(4, testAdd.add(2,2));
    }
    @Test
    public void addShouldReturn10(){
        var testAdd = new addNumbers();
        assertEquals(10, testAdd.add(7,3));
    }

    @Test
    public void addShouldReturnNeg2(){
        var testAdd = new addNumbers();
        assertEquals(-2, testAdd.add(-4, 2));
    }

    @Test
    public void addNegNumbsShouldReturnNeg(){
        var testAdd = new addNumbers();
        assertEquals(-10, testAdd.add(-5, -5));
    }
}