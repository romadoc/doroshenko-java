import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import taskthree.ArrayChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThirdTaskTest {
    static int counter = 0;

    @ParameterizedTest
    @CsvFileSource(resources = "/arrays.csv")
    public void isCalculationCorrect(String string) {
        String[] stringArray = string.split(", ");
        int[] intArray = Arrays.stream(stringArray).mapToInt(Integer::parseInt).toArray();
        ArrayChecker arrayChecker = new ArrayChecker();
        arrayChecker.listChecker(intArray);
        Assertions.assertEquals(Arrays.toString(getStandardList().get(counter)), arrayChecker.getRESULT_LIST().toString());
        counter++;
    }

    private List<int[]> getStandardList() {
        int[] listOne = {99};
        int[] listTwo = {39};
        int[] listThird = {78, 9, 21};
        List<int[]> etalons = new ArrayList<>();
        etalons.add(listOne);
        etalons.add(listTwo);
        etalons.add(listThird);
        return etalons;
    }
}
