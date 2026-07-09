// Last updated: 7/9/2026, 9:50:15 AM
class Solution {
    public String licenseKeyFormatting(String s, int k) {
        
        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            
            char ch = s.charAt(i);
            
            if (ch != '-') {
                
                if (sb.length() % (k + 1) == k) {
                    sb.append('-');
                }
                
                sb.append(Character.toUpperCase(ch));
            }
        }

        return sb.reverse().toString();
    }
}