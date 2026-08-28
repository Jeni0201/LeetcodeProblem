class Solution {
    public int strStr(String haystack, String needle) {
        int str1=haystack.length();
        int str2=needle.length();
        for(int i=0;i<=str1-str2;i++){
            int j=0;
            while(j<str2 && haystack.charAt(i+j) == needle.charAt(j)){
                j++;
            }
            if(j==str2){
                return i;
            }
        }
        return -1;
        
        
    }
}
