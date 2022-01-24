public class rowSumOddNumbers {
    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(42));
    }

    public static int rowSumOddNumbers(int n) {
        int countItemsBeforeLineN = 0, startLineN = 1, result = 0;
        for (int i = 1; i < n; i++)
            countItemsBeforeLineN += i;

        for (int i = 1; i <= countItemsBeforeLineN; i++)
            startLineN += 2;

        for (int i = 0; i<n; i++)
            result += startLineN + 2*i;

        return result;
    }
}
