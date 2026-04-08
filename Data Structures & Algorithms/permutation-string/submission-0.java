class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if (n > m) return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Frequency of s1
        for (int i = 0; i < n; i++) {
            freq1[s1.charAt(i) - 'a']++;
        }

        int i = 0; // left pointer
        for (int j = 0; j < m; j++) {
            freq2[s2.charAt(j) - 'a']++;  // include current char

            // If window size > n, shrink from left
            if (j - i + 1 > n) {
                freq2[s2.charAt(i) - 'a']--;
                i++;
            }

            // Check if the current window matches freq1
            if (j - i + 1 == n && matches(freq1, freq2)) {
                return true;
            }
        }
        return false;
    }

    // helper to compare two frequency arrays
    private boolean matches(int[] a, int[] b) {
        for (int k = 0; k < 26; k++) {
            if (a[k] != b[k]) return false;
        }
        return true;
    }
}
