import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class FindTheUniqueNumber {
    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
    }

    public static double findUniq(double arr[]) {
        Map<Double, Integer> voters = new HashMap<>();
        double nonUniqueNumber;

        for (int i = 0; i < 3; i++) {
            if (voters.containsKey(arr[i]))
                voters.put(arr[i], voters.get(arr[i]) + 1);
            else
                voters.put(arr[i], 1);
        }
        nonUniqueNumber = Collections.max(voters.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();

        for (double v : arr) {
            if (v != nonUniqueNumber)
                return v;
        }

        return arr[0];
    }
}
