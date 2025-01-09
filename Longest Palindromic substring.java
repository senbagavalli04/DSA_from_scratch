//CODE LINK : https://leetcode.com/problems/longest-palindromic-substring/description/
//This approach can be optimized 
class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 1){
            return s;
        }
        String longest = "";
        int n = s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String sub = s.substring(i,j+1);
                if(isPalin(sub)){
                    if(sub.length() > longest.length()){
                    longest = sub;
                }
                }
            }
        }
         return longest;
    }
    boolean isPalin(String sub){
        int l =0;
        int r = sub.length()-1;
        while(l<r){
            if(sub.charAt(l) != sub.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
