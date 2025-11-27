class Solution {
    public int lengthOfLongestSubstring(String s) {
        java.util.Set<Character> set = new java.util.HashSet<>();
        int l = 0, r = 0, max = 0;
        while (r < s.length()) {
            if (set.add(s.charAt(r))) {
                max = Math.max(max, r - l + 1);
                r++;
            } else {
                set.remove(s.charAt(l++));
            }
        }
        return max;
    }
}
