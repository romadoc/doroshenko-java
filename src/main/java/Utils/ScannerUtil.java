package Utils;

import java.util.Scanner;

public final class ScannerUtil {
    private ScannerUtil() {}

    public static int intIn(String s) {
        getString(s);
        int x = 0;
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()) {
            System.out.println();
            getString(s);
            scanner.next();
        }
        x = scanner.nextInt();
        return x;
    }

    public static String stringIn(String s) {
        getString(s);
        String string = "";
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextLine()) {
            System.out.println(s);
            scanner.next();
        }
        string = scanner.nextLine();
        return string;
    }

    private static String getString(String s) {
        s = s + " >>";
        System.out.print(s);
        return s;
    }
}
