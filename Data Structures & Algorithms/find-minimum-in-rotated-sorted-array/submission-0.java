class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int minVal = Integer.MAX_VALUE;
        while(l <= r){
            int mid = (l+r)/2;
            if(nums[l] <= nums[mid]){
                minVal = Math.min(minVal, nums[l]);
                l = mid+1;
            }
            else{
                minVal = Math.min(minVal, nums[mid]);
                r = mid-1;
            }
        }
        return minVal;
    }
}
