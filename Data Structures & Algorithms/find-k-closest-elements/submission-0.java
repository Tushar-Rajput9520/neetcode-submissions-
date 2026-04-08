class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        // Sort by closeness to x
        Collections.sort(list, (a, b) -> {
            int diff = Math.abs(a - x) - Math.abs(b - x);
            if (diff == 0) return a - b; // smaller number first if equal
            return diff;
        });

        // Take first k elements
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(list.get(i));
        }

        // Sort final result in ascending order
        Collections.sort(result);
        return result;
    }
}
