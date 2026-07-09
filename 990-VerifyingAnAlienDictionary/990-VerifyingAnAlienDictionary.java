// Last updated: 7/9/2026, 9:48:30 AM
class Solution {
    public boolean isAlienSorted(String[] W, String O) {
        Map<Character,Integer> alpha = new HashMap<>();
        for (int i = 0; i < O.length(); i++)
            alpha.put(O.charAt(i), i);
        for (int i = 1; i < W.length; i++) {
            String a = W[i-1], b = W[i];
            for (int j = 0; j < a.length(); j++) {
                if (j == b.length()) return false;
                char achar = a.charAt(j), bchar = b.charAt(j);
                if (alpha.get(achar) < alpha.get(bchar)) break;
                if (alpha.get(achar) > alpha.get(bchar)) return false;
            }
        }
        return true;
    }
}