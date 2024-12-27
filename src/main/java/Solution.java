class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int res = 0;
        int max = values[0];
        for(int i = 1; i < values.length; i++) {
            max--;
            res = Math.max(res, max + values[i]);
            max = Math.max(max, values[i]);
        }

        return res;
    }
}