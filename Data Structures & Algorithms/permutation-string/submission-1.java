class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int first[]=new int[26];
        int sec[]=new int[26];
        for(char ch:s1.toCharArray()){
            first[ch-'a']++;
        }
        int window=s1.length()-1;
        for(int i=0;i<s2.length();i++){
            sec[s2.charAt(i)-'a']++;
            if(i>=window){
                if(match(first,sec)) return true;
                sec[s2.charAt(i-window)-'a']--;
            }

        }
        return false;
        
    }
    public static boolean match(int[] first,int[] sec){
        for(int i=0;i<26;i++){
            if(first[i]!=sec[i]){
                return false;
            }
        }
        return true;
    }
}