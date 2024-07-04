class Solution {
    public String makeSmallestPalindrome(String s) {
        StringBuilder sb=new StringBuilder(s);
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
               if(s.charAt(i)>s.charAt(j)) 
                    sb.setCharAt(i,s.charAt(j));
                else
                    sb.setCharAt(j,s.charAt(i));
            }
            i++;
            j--;
        }
        return sb.toString();
    }
}