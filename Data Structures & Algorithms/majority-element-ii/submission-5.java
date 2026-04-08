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
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int key:map.keySet()){
            if(map.get(key)>nums.length/3){
                arr.add(key);
            }
        }
        return arr;
    }
}
