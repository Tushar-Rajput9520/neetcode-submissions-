class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int res=0;
        // for(int i=0;i<s.length();i++){
        //     Set<Character> set=new HashSet<>();
        //     for(int j=i;j<s.length();j++){
        //         if(set.contains(s.charAt(j))){
        //             break;
        //         }
        //         set.add(s.charAt(j));
        //     }
        //     res=Math.max(res,set.size());
        // }
        // return res;
        int n=s.length();
int left=0, right=0;
int maxLen=0;
HashSet<Character> set=new HashSet<>();

while(right<n){
    if(!set.contains(s.charAt(right))){
        set.add(s.charAt(right));
        maxLen=Math.max(maxLen,right-left+1);
        right++;
    }else{
        set.remove(s.charAt(left));
        left++;
    }
}
return maxLen;

        
    }
}
