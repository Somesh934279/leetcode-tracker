// Last updated: 7/9/2026, 9:51:41 AM
public class Solution {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";

        System.out.println(lengthOfLastWord(s1)); 
        System.out.println(lengthOfLastWord(s2)); 
        System.out.println(lengthOfLastWord(s3)); 
    }

    public static int lengthOfLastWord(String s) {
     
        s = s.trim();
        
        
        int lastSpaceIndex = s.lastIndexOf(' ');
        
       
        if (lastSpaceIndex == -1) {
            return s.length();
        }
        
        
        return s.length() - lastSpaceIndex - 1;
    }
}