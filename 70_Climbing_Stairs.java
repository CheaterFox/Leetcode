class Solution {
    public int climbStairs(int n) {

        if(n <= 1) {
            return 1;
        }

        int[] stepsForTop = new int[n + 1];
        stepsForTop[1] = 1;
        stepsForTop[2] = 2;

        for(int i = 3; i <= n; i++){
            stepsForTop[i] = stepsForTop[i-1] + stepsForTop[i-2];
        }

        return stepsForTop[n];
    }
}