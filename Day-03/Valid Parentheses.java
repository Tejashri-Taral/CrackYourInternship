class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);

            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')
            {
                st.push(c);
            }else {
                if (st.isEmpty()) {
                    return false;
                }
                char ch = st.pop();
                if ((c == ')' && ch != '(') || (c == '}' && ch != '{') || (c == ']' && ch != '[')) {
                    return false;
                }
            }
        }
        return st.isEmpty();
          
    }
}
