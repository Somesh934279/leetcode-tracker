// Last updated: 7/9/2026, 9:47:49 AM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int odd = 0, even = 0;

        for (int i = 0; i < position.length; i++) {
            if (position[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        return odd < even ? odd : even;
    }
}