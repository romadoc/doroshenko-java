package taskthree;

public class ArrayConstructor {

    public int[] createArray(int n) {
        if (n < 0) {
            n = n * -1;
        }
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            int x = (int) (Math.random() * 100);
            array[i] = x;
        }
        return array;
    }
}
