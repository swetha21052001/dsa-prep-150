class Solution {
     public void subset(int[] nums, int index, List<Integer> subs, List<List<Integer>> ans){
        ans.add(new ArrayList<>(subs));
        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]) continue;
            subs.add(nums[i]);     
            subset(nums,i+1,subs,ans);
            subs.remove(subs.size()-1);
        }   
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        subset(nums,0,new ArrayList<Integer>(), ans);
        return ans;
    }
}
