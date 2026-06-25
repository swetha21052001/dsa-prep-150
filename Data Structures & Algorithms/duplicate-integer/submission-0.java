class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> count = new HashMap<>();
        for(int n: nums){
            count.put(n, count.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> en: count.entrySet()){
            if(en.getValue()>1){
                return true;
            }
        }
        return false;
    }
}