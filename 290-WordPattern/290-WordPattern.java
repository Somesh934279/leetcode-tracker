// Last updated: 7/9/2026, 9:50:46 AM
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        for (int i=0;i<pattern.length();i++) {
            for (int j=i+1;j<pattern.length();j++) {
                if (pattern.charAt(i) == pattern.charAt(j)) {
                    if (!words[i].equals(words[j])) {
                        return false;
                    }
                } else {
                    if (words[i].equals(words[j])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}