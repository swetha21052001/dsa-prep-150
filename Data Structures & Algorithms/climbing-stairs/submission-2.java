class Solution {
    public int climbStairs(int n) {
        int ans = 0;
        int ans_1 = 1;
        int ans_2 = 1;
        for(int i = 2; i< n+1;i++){
            ans = ans_1 + ans_2;
            ans_2 = ans_1;
            ans_1 = ans;
        }
        return ans_1;
    }
}
