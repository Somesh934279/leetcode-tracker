// Last updated: 7/9/2026, 9:50:42 AM
public class Solution {
    public int minPatches(int[] nums, int n) {
        long maxReachable = 0; 
        int patches = 0;
        int i = 0;
        
        while (maxReachable < n) {
            
            if (i < nums.length && nums[i] <= maxReachable + 1) {
                maxReachable += nums[i];
                i++;
            } else {
               
                maxReachable += (maxReachable + 1);
                patches++;
            }
        }
        
        return patches;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        
        System.out.println(solution.minPatches(new int[]{1, 3}, 6)); 
        System.out.println(solution.minPatches(new int[]{1, 5, 10}, 20)); 
        System.out.println(solution.minPatches(new int[]{1, 2, 2}, 5)); 
    }
}