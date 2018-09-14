class Solution {
    public int climbStairs(int n) {
        if (n < 2) {
            return n;
        }
        
        int[] solutions = new int[n+1];
        solutions[1] = 1;
        solutions[2] = 2;
        
        for (int i = 3; i <= n; i++) {
            solutions[i] = solutions[i-1] + solutions[i-2];
        }
        
        return solutions[n];
    }
}
