import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> result = kidsWithGreatestCandies(candies, extraCandies);  
        System.out.println("Result: " + result);
    }

    public static List<Boolean> kidsWithGreatestCandies(int[] candies, int extraCandies) {
        List<Boolean> resultBoolean = new ArrayList<>();
        int maxCandies = Integer.MIN_VALUE;
        for(int i : candies) {
            if(i > maxCandies) {
                maxCandies = i;
            }
        }

        for(int i : candies) {
            if(i + extraCandies >= maxCandies) {
                resultBoolean.add(true);
            } else {
                resultBoolean.add(false);
            }
        }
        return resultBoolean;
    }
}
