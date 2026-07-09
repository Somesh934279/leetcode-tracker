// Last updated: 7/9/2026, 9:47:20 AM
class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] arr = sentence.split(" ");               
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i].startsWith(searchWord)){                
                return i+1;
            }
        }
        return -1;
    }
}