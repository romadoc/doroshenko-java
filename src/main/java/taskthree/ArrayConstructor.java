package taskthree;

public class ArrayConstructor {

    public int[] createArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            int x = (int) (Math.random() * 100);
            array[i] = x;
        }
        return array;
    }
}
