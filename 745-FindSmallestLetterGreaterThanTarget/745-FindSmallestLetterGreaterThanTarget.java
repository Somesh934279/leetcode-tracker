// Last updated: 7/9/2026, 9:49:25 AM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<letters[mid]){//always move in right direction for this question because we are looking for it
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            // till here this is basic binary search 
        }
        return letters[start%letters.length];

        // Here return is the gamechanger
        
    }
}