package tasktwo;

public class StringChecker {
    private final String responseString = "Привет, ";
    private final String pattern = "Вячеслав";
    private final String warning = "Нет такого имени";

    public boolean responseToString(String name) {
        if (name.equals(pattern)) {
            System.out.println(responseString + pattern);
            return true;
        } else {
            System.out.println(warning);
        }
        return false;
    }
}
