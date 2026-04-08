class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            int[] freq = new int[26]; // to count characters
            int maxFreq = 0;

            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'A']++;
                maxFreq = Math.max(maxFreq, freq[s.charAt(j) - 'A']);

                int windowLen = j - i + 1;
                int changes = windowLen - maxFreq;

                if (changes <= k) {
                    maxLen = Math.max(maxLen, windowLen);
                }
            }
        }
        return maxLen;
    }
}
