import java.util.Arrays;

public class AreSame {
    public static void main(String[] args) {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};

        comp(a, b);
    }

    public static boolean comp(int[] a, int[] b) {
        if(a ==null || b == null || a.length != b.length)
            return false;

        a = Arrays.stream(a).map(Math::abs).toArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i=0; i<a.length; i++){
            if(Math.pow(a[i], 2) != b[i])
                return false;
        }
        return true;
    }
}
