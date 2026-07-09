// Last updated: 7/9/2026, 9:47:21 AM
class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int a = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (queryTime >= startTime[i] && queryTime <= endTime[i]) {
                a++;
            }
        }
        return a;
    }
}