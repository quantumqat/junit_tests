import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradingTest {
    Grading gradable;
    @BeforeEach
    void setUp(){
         gradable = new Grading();
    }
    @Test
    void negNumShouldReturnIllArg(){
        assertThrows(IllegalArgumentException.class, () -> {
            gradable.returnLetterGrade(-1);
        });
    }
    @Test
    void gradeShouldReturnA(){
        //var gradable = new Grading();
        assertEquals('A', gradable.returnLetterGrade(93));
    }
    @Test
    void gradeShouldReturnB(){
        //var gradable = new Grading();
        assertEquals('B', gradable.returnLetterGrade(85));
    }
    @Test
    void gradeShouldReturnC(){
       // var gradable = new Grading();
        assertEquals('C', gradable.returnLetterGrade(77));
    }
    @Test
    void gradeShouldReturnD(){
        //var gradable = new Grading();
        assertEquals('D', gradable.returnLetterGrade(61));
    }
    @Test
    void gradeShouldReturnF(){
        //var gradable = new Grading();
        assertEquals('F', gradable.returnLetterGrade(59));
    }
    @Test
    void ninetyShouldReturnA(){
       // var gradable = new Grading();
        assertEquals('A', gradable.returnLetterGrade(90));
    }
    @Test
    void eightyShouldReturnB(){
        //var gradable = new Grading();
        assertEquals('B', gradable.returnLetterGrade(80));
    }
    @Test
    void seventyShouldReturnC(){
        //var gradable = new Grading();
        assertEquals('C', gradable.returnLetterGrade(70));
    }
    @Test
    void sixtyShouldReturnD(){
       // var gradable = new Grading();
        assertEquals('D', gradable.returnLetterGrade(60));
    }
    @Test
    void fiftyShouldReturnF(){
        //var gradable = new Grading();
        assertEquals('F', gradable.returnLetterGrade(50));
    }



}