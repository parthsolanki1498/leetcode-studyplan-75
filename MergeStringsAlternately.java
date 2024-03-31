public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "defg";
        String result = mergeAlternately(word1, word2);
        System.out.println("Result: " + result);
    }

    public static String mergeAlternately(String word1, String word2){
        String result = "";
        int longestStringLen = (word1.length() > word2.length()) ? word1.length() : word2.length();

        for(int i = 0; i < longestStringLen; i++) {
            if(i < word1.length()) {
                result += word1.charAt(i);
            }
            if(i < word2.length()) {
                result += word2.charAt(i);
            }
        }
        return result;
    }
}