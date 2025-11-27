class Solution {
    public int characterReplacement(String s, int k) {
        int[] cnt = new int[26];
        int l = 0, r = 0, maxCount = 0, maxLen = 0;
        while (r < s.length()) {
            maxCount = Math.max(maxCount, ++cnt[s.charAt(r++) - 'A']);
            if (r - l - maxCount > k) cnt[s.charAt(l++) - 'A']--;
            maxLen = Math.max(maxLen, r - l);
        }
        return maxLen;
    }
}
