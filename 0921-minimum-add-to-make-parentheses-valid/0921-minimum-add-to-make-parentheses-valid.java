class Solution {
    public int minAddToMakeValid(String s) {
        int n=s.length();
        int c=0;
        int c1=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(s.charAt(i)=='('){
                    if(s.charAt(j)==')')
                        c1++;
                    else
                        c++;
                }
                else{
                    c++;
                }
            }
        }
        return (c);
    }
}