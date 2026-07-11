class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void backtrack(int[] nums, int index, int target, List<Integer>combo){
        if(target==0){
            ans.add(new ArrayList<>(combo));
            return;
        }
        if(index == nums.length || target< 0) return;

        backtrack(nums,index+1,target,combo);
       
        combo.add(nums[index]);
        backtrack(nums, index, target - nums[index], combo);
        combo.remove(combo.size() - 1);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        backtrack(nums,0,target,new ArrayList<>());
        return ans;
    }
}