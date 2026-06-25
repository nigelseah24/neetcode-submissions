class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // k = 2, hours = 6
        // k = 1, hours = 10
        // find min k such that hours < 9

        int l = 1, r = Arrays.stream(piles).max().getAsInt();
        int res = r;

        while (l <= r) {
            int k = (l + r) / 2;

            for (int p : piles) {
                if (hoursNeeded(k, piles) <= h) {
                    res = k;
                    r = k - 1;
                } else {
                    l = k + 1;
                }
            }
        }
        
        return res;
    }

    private int hoursNeeded(int k, int[] piles) {
        int total = 0;
        for (int pile : piles) {
            // total += (pile + k - 1) / k
            // total += pile / k + (pile % k == 0 ? 0 : 1);
            total += Math.ceilDiv(pile, k);
        }
        return total;
    }
}
