import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class checkBooleanTest {
    @Test
    void resultShouldReturnTrue(){
        var boolCheck = new checkBoolean();
        assertTrue(boolCheck.evaluateSums(5,2));
    }
}