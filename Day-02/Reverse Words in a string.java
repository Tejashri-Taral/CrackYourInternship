class Solution {
    public String reverseWords(String s) {
        String[] ans=s.trim().split("\\s+");
        
        String result="";
        for(int i=ans.length-1;i>0;i--) {
            result+=ans[i]+" ";
        }
        return result+ans[0];
    }
}
