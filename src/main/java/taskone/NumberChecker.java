package taskone;

public class NumberChecker {
    private final String RESPONSE_STRING = "Привет";
    public boolean responseToNumber(int number) {
        if (number > 7) {
            System.out.println(RESPONSE_STRING);
            return true;
        } else {
            System.out.println("Try again!");
        }
        return false;
    }
}
