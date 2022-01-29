package taskone;

public class NumberChecker {
    private final String responseString = "Привет";
    public boolean responseToNumber(int number) {
        if (number > 7) {
            System.out.println(responseString);
            return true;
        } else {
            System.out.println("Try again!");
        }
        return false;
    }
}
