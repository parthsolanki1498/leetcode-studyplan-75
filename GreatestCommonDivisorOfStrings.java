public class GreatestCommonDivisorOfStrings {
    
    public static void main(String[] args) {
        String str1 = "ABABAB";
        String str2 = "ABAB";
        String result = gcdOfStrings(str1, str2);
        System.out.println("Result: " + result);
    }

    public static String gcdOfStrings(String str1, String str2) {
        if(str2.length() > str1.length()) {
            return gcdOfStrings(str2, str1);
        } else if(!str1.startsWith(str2)) {
            return "";
        } else if (str2.isEmpty()){
            return str1;
        } else {
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }
    }
}
