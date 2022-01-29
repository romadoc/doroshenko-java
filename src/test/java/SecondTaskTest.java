import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import tasktwo.StringChecker;

public class SecondTaskTest {
    private final String nameConst = "Вячеслав";
    @ParameterizedTest
    @CsvFileSource(resources = "/names.csv")

    public void isCheckerInSecondTaskOK(String name) {
        StringChecker stringChecker = new StringChecker();
        if (name.equals(nameConst)) {
            Assertions.assertTrue(stringChecker.responseToString(name), "method should return true");
        } else {
            Assertions.assertFalse(stringChecker.responseToString(name), "method should return false");
        }
    }
}
