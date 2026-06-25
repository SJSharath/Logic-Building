class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> sc = new HashSet<Integer>();
        for(int i = 0;i<nums.length;i++){
            sc.contains(nums[i]);
            if(!sc.add(nums[i])){
                return true;
            }
            sc.add(nums[i]);
        }
        return false;
    }
}