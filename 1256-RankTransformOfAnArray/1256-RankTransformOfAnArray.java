// Last updated: 7/9/2026, 9:47:59 AM
import java.util.*;
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> valueToRank = new HashMap<>();  
        int[] sortedUniqueNumbers = Arrays.stream(arr).distinct().sorted().toArray();  
        for (int i = 0; i < sortedUniqueNumbers.length; i++) {
            valueToRank.put(sortedUniqueNumbers[i], i + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = valueToRank.get(arr[i]);
        }
        return arr; 
    }
}
