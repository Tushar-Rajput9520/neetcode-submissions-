class Solution {
    public boolean isAnagram(String s, String t) {
        // if lengths differ, cannot be anagrams
        if (s.length() != t.length()) return false;

        // frequency array for 26 lowercase letters
        int[] freq = new int[26];

        // count chars in s
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // subtract counts for chars in t
        for (char c : t.toCharArray()) {
            freq[c - 'a']--;
        }

        // check if all counts are zero
        for (int count : freq) {
            if (count != 0) return false;
        }

        return true;
    }
}
