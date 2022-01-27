package tasktwo;

public class StringChecker {
    private final String RESPONSE_STRING = "Привет, ";
    private final String PATTERN = "Вячеслав";
    public boolean responseToString(String name) {
        if (name.equals(PATTERN)) {
            System.out.println(RESPONSE_STRING + PATTERN);
            return true;
        } else {
            System.out.println("Нет такого имени");
        }
        return false;
    }
}
