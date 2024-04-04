import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testCalcOne() {
        int result1 = LastDigit.getResult(2,2);
        Assertions.assertEquals(4, result1);
        int result2 = LastDigit.getResult(3,2);
        Assertions.assertEquals(9, result2);
        int result3 = LastDigit.getResult(3,4);
        Assertions.assertEquals(1, result3);
//        int result4 = LastDigit.getResult(5,3);
//        Assertions.assertEquals(5, result4);
        int result5 = LastDigit.getResult(10,1000000);
        Assertions.assertEquals(0, result5);
    }
} 