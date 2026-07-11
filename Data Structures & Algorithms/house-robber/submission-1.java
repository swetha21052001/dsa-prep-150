class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int num_1 = nums[0];
        int num_2 = Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            int temp = Math.max(num_1+nums[i], num_2);
            num_1 = num_2;
            num_2 = temp;
        }
        return num_2;
    }
}
