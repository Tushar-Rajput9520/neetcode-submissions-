

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // convert word to key by sorting
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            // if key not there, make new list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // add string to its group
            map.get(key).add(s);
        }

        // make result list and add all groups
        List<List<String>> result = new ArrayList<>();
        for (List<String> group : map.values()) {
            result.add(group);
        }

        return result;
    }
}
