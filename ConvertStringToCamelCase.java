public class ConvertStringToCamelCase {
    public static void main(String[] args) {
        toCamelCase("the_Stealth_Warrior");
    }
    static String toCamelCase(String s){
        StringBuilder sb = new StringBuilder(s);
        for (int i=0; i<sb.length(); i++){
            if(sb.charAt(i) == '_' || sb.charAt(i) == '-'){
                sb.setCharAt(i+1, Character.toUpperCase(sb.charAt(i+1)));
                sb = sb.replace(i, i+1, "");
            }
        }
        return sb.toString();
    }
}
