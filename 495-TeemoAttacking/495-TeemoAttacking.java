// Last updated: 7/9/2026, 9:50:12 AM
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int n = timeSeries.length;
        if(n==0){
            return 0;
        }
        int ans = 0;
        for(int i=0; i<n-1;i++){
            ans = ans + Math.min(duration,timeSeries[i+1]-timeSeries[i]);
        }
        ans += duration ;
        return ans ;
    }
}