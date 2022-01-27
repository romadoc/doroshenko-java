package tasktwo;

import Utils.ScannerUtil;

public class Main {
    private static final String INVITATION = "enter any human name";

    public static void main(String[] args) {
        StringChecker stringChecker = new StringChecker();
        boolean isAnswerCorrect = false;
        while (!isAnswerCorrect) {
            String s = ScannerUtil.stringIn(INVITATION);
            isAnswerCorrect = stringChecker.responseToString(s);
        }
    }
}
