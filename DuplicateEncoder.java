import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {
    public static void main(String[] args) {
        encode("Prespecialized");
    }

    static String encode(String word){
        Map<Character, Integer> mapper = new HashMap<>();
        StringBuilder result = new StringBuilder(word.length());
        word = word.toLowerCase();

        for (int i=0; i<word.length(); i++)
            mapper.put(word.charAt(i), mapper.containsKey(word.charAt(i)) ? mapper.get(word.charAt(i)) + 1 : 1);

        for (int i=0; i<word.length(); i++)
            if(mapper.get(word.charAt(i)) > 1)
                result.append(")");
            else
                result.append("(");

        return result.toString();
    }
}
