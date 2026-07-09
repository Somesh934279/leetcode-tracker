// Last updated: 7/9/2026, 9:52:06 AM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int lb = lowerBound(nums, n, target);
        if(lb == n || nums[lb] != target){
            return new int[]{-1, -1};
        }
        return new int[] {lb, upperBound(nums, n, target) - 1};
    }

    static int lowerBound(int[] arr, int n, int target){
        int low = 0, high = n-1;
        int ans = n;

        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] >= target){
                ans = mid;
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return ans;
    }

    static int upperBound(int[] arr, int n, int target){
        int low = 0, high = n-1;
        int ans = n;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] > target){
                ans = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }
}