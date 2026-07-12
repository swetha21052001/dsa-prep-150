class Solution {
    public int dp(int[] nums, int s, int e){
        int ans_1 = nums[s];
        int ans_2 = Math.max(nums[s], nums[s+1]);
        for(int i = s+2; i<=e;i++){
            int temp = Math.max(nums[i]+ ans_1, ans_2);
            ans_1 = ans_2;
            ans_2 = temp;
        }
        return ans_2;
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==0) return -1;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0], nums[1]);
        return Math.max(dp(nums,0,n-2), dp(nums,1,n-1));
    }
}
