import java.util.Arrays;

public class EqualSidesOfAnArray {
    public static void main(String[] args) {
        System.out.println(findEvenIndex(new int[] {5, 5, 5, 1, 20, -5}));
    }

    public static int findEvenIndex(int[] arr) {

        int rightSum = sum(arr, 1, arr.length-1);
        int leftSum = sum(arr, 0, arr.length-2);
        int targetIndex = 0;

        if (rightSum == 0)
            return 0;

        if (leftSum == 0)
            return arr.length-1;
        leftSum = 0;

        for (int i=0; i<arr.length-1; i++){
            if(rightSum == leftSum)
                return targetIndex;
            else {
                leftSum += arr[i];
                rightSum -= arr[i+1];
                targetIndex = i+1;
            }
        }
        return -1;
    }

    private static int sum(int[] arr, int start, int end) {
        int sum=0;
        for (int i=start; i<=end; i++)
            sum +=arr[i];
        return sum;
    }
}
