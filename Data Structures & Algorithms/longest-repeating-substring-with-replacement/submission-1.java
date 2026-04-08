class Solution {
    public int characterReplacement(String s, int k) {
        // int n = s.length();
        // int maxLen = 0;

        // for (int i = 0; i < n; i++) {
        //     int[] freq = new int[26]; // to count characters
        //     int maxFreq = 0;

        //     for (int j = i; j < n; j++) {
        //         freq[s.charAt(j) - 'A']++;
        //         maxFreq = Math.max(maxFreq, freq[s.charAt(j) - 'A']);

        //         int windowLen = j - i + 1;
        //         int changes = windowLen - maxFreq;

        //         if (changes <= k) {
        //             maxLen = Math.max(maxLen, windowLen);
        //         }
        //     }
        // }
        // return maxLen;
        int[] count = new int[26]; // freq of each char
        int left = 0, maxCount = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'A']++;
            maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);

            // If window is invalid -> shrink from left
            while ((right - left + 1) - maxCount > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            // Update maxLen
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
