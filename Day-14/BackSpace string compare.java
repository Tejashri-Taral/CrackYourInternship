class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder str = new StringBuilder("");

        for(char ch: t.toCharArray()){
            if(ch != '#'){
                str.append(ch);
            }else if(str.length()>0){
                str.deleteCharAt(str.length()-1);
            }            
        }
        t = str.toString();
        
        str.setLength(0);
        for(char ch: s.toCharArray()){
            if(ch != '#'){
                str.append(ch);
            }else if(str.length()>0){
                str.deleteCharAt(str.length()-1);
            }            
        }
        s = str.toString();

        return s.equals(t)? true: false;
    }
}
