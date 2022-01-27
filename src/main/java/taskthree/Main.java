package taskthree;

import utils.ScannerUtil;

public class Main {
    public static void main(String[] args) {
        ArrayConstructor arrayConstructor = new ArrayConstructor();
        int[] array = arrayConstructor.createArray(ScannerUtil.intIn("type length of array"));
        ArrayChecker arrayChecker = new ArrayChecker();
        arrayChecker.listChecker(array);
    }
}
