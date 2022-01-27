package taskone;

import Utils.ScannerUtil;

public class Main {
    private static final String INVITATION = "Type any number (integer)";
    public static void main(String[] args) {
        NumberChecker numberChecker = new NumberChecker();
        boolean isAnswerCorrect = false;
        while (!isAnswerCorrect) {
            int x = ScannerUtil.intIn(INVITATION);
            isAnswerCorrect = numberChecker.responseToNumber(x);
        }
    }
}
