// Last updated: 7/9/2026, 9:52:28 AM
public class Solution {
    public String intToRoman(int num) {
        int[] val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] syms = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        StringBuilder romanNumeral = new StringBuilder();
        for (int i = 0; i < val.length; i++) {
            while (num >= val[i]) {
                romanNumeral.append(syms[i]);
                num -= val[i];
            }
        }
        return romanNumeral.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.intToRoman(3749));  
        System.out.println(solution.intToRoman(58));   
        System.out.println(solution.intToRoman(1994));  
    }
}