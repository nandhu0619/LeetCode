class Solution {
    public int countSegments(String s) {
        if(s==null)
            return 0;
        String[] str=s.split(" ");
        
        return str.length;
    }
}