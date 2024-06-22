class Solution {
    public String removeOuterParentheses(String s) {
      String str="";
      int c=0;
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='(' && c++>0){
            str=str+s.charAt(i);
        }
        if(s.charAt(i)==')' && c-->1){
            str=str+s.charAt(i);
        }
      }  
      return str;
    }
}