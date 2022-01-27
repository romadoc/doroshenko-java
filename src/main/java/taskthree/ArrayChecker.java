package taskthree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayChecker {
   private final List<Integer> RESULT_LIST = new ArrayList<>();

   public void listChecker(int[] arrayIn) {
       if (arrayIn != null) {
           for (int n : arrayIn) {
               if (n % 3 == 0) {
                   RESULT_LIST.add(n);
               }
           }
           printResult(arrayIn);
       }
   }

   public void printResult(int[] array) {
       System.out.println("generated array: " + Arrays.toString(array));
       System.out.print("found elements: ");
       for (Integer integer : RESULT_LIST) {
           System.out.print(integer + "; ");
       }
       System.out.println();
   }

    public List<Integer> getRESULT_LIST() {
        return RESULT_LIST;
    }
}
