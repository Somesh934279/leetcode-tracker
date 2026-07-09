// Last updated: 7/9/2026, 9:48:38 AM
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int res[]=new int[nums.length];
        List<Integer>even=new ArrayList<>();
        List<Integer>odd=new ArrayList<>();
        for(int i:nums){
            if(i%2==0){
                even.add(i);
            }
            else{
                odd.add(i);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        for(int i=0;i<even.size();i++){
            res[i*2]=even.get(i);
        }
        int index=1;
        for(int i=0;i<odd.size();i++){
            res[index]=odd.get(i);
            index+=2;
        }
        return res;
    }
}