class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Step 1: Sort the array
        Arrays.sort(strs);

        // Step 2: Compare only the first and last strings
        String first = strs[0];
        String last = strs[strs.length - 1];

        int idx = 0;
        while (idx < first.length() && idx < last.length() && first.charAt(idx) == last.charAt(idx)) {
            idx++;
        }

        // Step 3: Return common prefix
        return first.substring(0, idx);
    }
}
