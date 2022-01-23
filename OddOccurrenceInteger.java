import java.util.*;

public class OddOccurrenceInteger {
    public static void main(String[] args) {
        int result = findIt(new int[]{1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1}); // 10
        System.out.println(result);
    }

    public static int findIt(int[] tab) {

        if (tab.length == 1)
            return tab[0];
        List<Integer> targetList = new ArrayList<>();
        Arrays.stream(tab).forEach(targetList::add);
        Collections.sort(targetList);
        Stack<Integer> stack = new Stack<>();

        for (int element : targetList)
            if (stack.isEmpty()) {
                stack.push(element);
            } else
                if (stack.peek() == element)
                    stack.push(element);
                else
                    if (stack.size() % 2 == 1)
                        return stack.peek();
                    else {
                        stack.clear();
                        stack.push(element);
                    }

        return stack.peek(); // Odd found in the last
    }
}
