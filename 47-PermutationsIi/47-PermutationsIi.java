// Last updated: 7/9/2026, 9:51:52 AM
class Solution {
    public void fun(List<List<Integer>> ans, List<Integer>ds, int[] nums,boolean[] check){
        if(ds.size()>=nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1] && !check[i-1] || check[i]) continue;
            check[i] = true;
            ds.add(nums[i]);
            fun(ans,ds,nums,check);
            check[i] = false;
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] check = new boolean[nums.length];
        fun(ans,new ArrayList<>(), nums,check);
        return ans;
    }
}