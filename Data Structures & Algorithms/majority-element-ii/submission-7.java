class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // ArrayList<Integer> res = new ArrayList<>();

        // for (int i = 0; i < nums.length; i++) {
        //     int count = 0;
        //     for (int j = 0; j < nums.length; j++) {
        //         if (nums[i] == nums[j]) {
        //             count++;
        //         }
        //     }
        //     if (count > nums.length / 3 && !res.contains(nums[i])) {
        //         res.add(nums[i]);
        //     }
        // }

        // return res;
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int num:nums){
        //     map.put(num,map.getOrDefault(num,0)+1);
        // }
        // ArrayList<Integer> arr=new ArrayList<>();
        // for(int key:map.keySet()){
        //     if(map.get(key)>nums.length/3){
        //         arr.add(key);
        //     }
        // }
        // return arr;
        Integer candi1 = null, candi2 = null;
    int count1 = 0, count2 = 0;

    // 1st pass: find potential candidates
    for (int num : nums) {
        if (candi1 != null && num == candi1) count1++;
        else if (candi2 != null && num == candi2) count2++;
        else if (count1 == 0) {
            candi1 = num;
            count1 = 1;
        } else if (count2 == 0) {
            candi2 = num;
            count2 = 1;
        } else {
            count1--;
            count2--;
        }
    }

    // 2nd pass: count actual frequencies
    int freq1 = 0, freq2 = 0;
    for (int num : nums) {
        if (num == candi1) freq1++;
        else if (num == candi2) freq2++;
    }

    ArrayList<Integer> result = new ArrayList<>();
    if (freq1 > nums.length / 3) result.add(candi1);
    if (freq2 > nums.length / 3) result.add(candi2);

    return result;
}
}
