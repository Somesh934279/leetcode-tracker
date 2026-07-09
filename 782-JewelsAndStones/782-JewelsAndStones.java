// Last updated: 7/9/2026, 9:49:19 AM
class Solution {
    public int numJewelsInStones(String jew, String st) {
        int cnt = 0;
        for(int i = 0 ; i < jew.length() ; i++){
            char ch = jew.charAt(i);
            for(int j = 0 ; j < st.length() ; j++){
                if(ch == st.charAt(j))cnt++;
            }
        }
        return cnt;
    }
}