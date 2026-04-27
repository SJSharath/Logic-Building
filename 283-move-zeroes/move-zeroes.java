class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0;
        int index = 0;
        
        while (i < n) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
            i++;
        }

        while (index < n) {
            nums[index] = 0;
            index++;
        }
    }
}