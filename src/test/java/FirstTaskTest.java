import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import taskone.NumberChecker;

public class FirstTaskTest {
    @Test
    public void isCheckerInFirstTaskOK() {
        NumberChecker numberChecker = new NumberChecker();
        Assertions.assertTrue(numberChecker.responseToNumber(8));
        Assertions.assertFalse(numberChecker.responseToNumber(7));
        Assertions.assertFalse(numberChecker.responseToNumber(5));
    }
}
