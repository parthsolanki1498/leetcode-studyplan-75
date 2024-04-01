public class ReverseVowelsOfaString {
    public static void main(String[] args) {
        String s = "hello";
        String result = reverseVowels(s);
        System.out.println("Result: " + result);
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    
    public static String reverseVowels(String s) {
        String onlyVowels = "";
        for(int i = 0; i < s.length(); i++) {
            if(isVowel(s.charAt(i))) {
                onlyVowels += s.charAt(i);
            }
        }

        int onlyVowelsLen = onlyVowels.length();
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < s.length(); i++){
            if(isVowel(s.charAt(i))) {
                sb.setCharAt(i, onlyVowels.charAt(onlyVowelsLen - 1));
                onlyVowelsLen--;
            }
        }
        
        return sb.toString();
    }
}
