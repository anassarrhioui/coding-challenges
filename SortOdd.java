import java.util.*;

public class SortOdd {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{ 5, 3, 2, 8, 1, 4 })));

    }
    public static int[] sortArray(int[] array) {
        List<Integer> oddNumbers = new ArrayList<>();
        int oddCursor = 0;
        int[] result = new int[array.length];

        for (int i=0; i<array.length; i++){
            if(array[i] % 2 == 0)
                result[i] = array[i];
            else
                oddNumbers.add(array[i]);

        }
        Collections.sort(oddNumbers);

        for (int i=0; i<array.length; i++){
            if(array[i] % 2 != 0)
                result[i] = oddNumbers.get(oddCursor++);
        }
        return result;
    }
}
