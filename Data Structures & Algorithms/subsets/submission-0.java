class Solution {
    public void subset(int[] nums, int index, List<Integer> subs, List<List<Integer>> ans){
        if(index==nums.length){
            ans.add(new ArrayList<>(subs));
            return;
        }
        subs.add(nums[index]);     
        subset(nums,index+1,subs,ans);
        subs.remove(subs.size()-1);
        subset(nums,index+1,subs,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        subset(nums,0,new ArrayList<Integer>(), ans);
        return ans;
    }
}
