import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DescendingOrder {

    public static void main(String[] args) {
	    sortDesc(123056324);
    }

    public static int sortDesc(final int num) {

        List<Byte> digits = new ArrayList<>();
        int n = num;
        long result = 0;
        byte r;

        while (n > 0){
            r = (byte) (n %10);
            n = n/10;
            digits.add(r);
        }

        Collections.sort(digits, Collections.reverseOrder());

        for (byte d : digits){
            result += d;
            result *= 10;
        }
        result /=10;
        return (int) result;
    }
}
