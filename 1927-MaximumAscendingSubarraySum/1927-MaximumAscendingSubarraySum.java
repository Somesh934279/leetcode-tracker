// Last updated: 7/9/2026, 9:47:03 AM
class Solution {
    public int maxAscendingSum(int[] nums) {
        int res = nums[0],temp = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(nums[i] > nums[i-1])
                temp+=nums[i];
            else
                temp = nums[i];
            res = Math.max(res,temp);
        }
        return res;
    }
}