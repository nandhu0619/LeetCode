class Solution {
    public int minSwaps(String s) {
        int n=s.length();
        Stack<Character>st=new Stack<>();
        int c=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='[')
                st.push(s.charAt(i));
            else{
                if(!st.isEmpty())
                    st.pop();
                else
                    c++;
            }
        }
        return(c+1)/2;
    }
}