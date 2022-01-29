package taskthree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayChecker {
   private final List<Integer> resultList = new ArrayList<>();

   public void listChecker(int[] arrayIn) {
       if (arrayIn != null) {
           for (int n : arrayIn) {
               if (n % 3 == 0) {
                   resultList.add(n);
               }
           }
           printResult(arrayIn);
       }
   }

   public void printResult(int[] array) {
       System.out.println("generated array: " + Arrays.toString(array));
       System.out.print("found elements: ");
       for (Integer integer : resultList) {
           System.out.print(integer + "; ");
       }
       System.out.println();
   }

    public List<Integer> getResultList() {
        return resultList;
    }
}
