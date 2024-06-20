class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
       int c=0;
       int m;
       if(ruleKey.equals("type")){
        m=0;
       }
       else if(ruleKey.equals("color")){
        m=1;
       }
       else{
        m=2;
       }
       for(List<String>item :items){
            if(item.get(m).equals(ruleValue)){
                c++;
            }
       } 
       return c;
    }
}