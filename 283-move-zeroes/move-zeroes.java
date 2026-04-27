class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        // convert array to list
        for (int num : nums) {
            list.add(num);
        }

        int x = Collections.frequency(list, 0);
        if (x == 0) return;

        int i = 0;
        int b = list.size() - x;

        while (i < b) {
            if (list.get(i) == 0) {
                int z = list.remove(i);  // pop(i)
                list.add(z);             // append
            } else {
                i++;
            }
        }

        // copy back to array
        for (int j = 0; j < nums.length; j++) {
            nums[j] = list.get(j);
        }
    }
}