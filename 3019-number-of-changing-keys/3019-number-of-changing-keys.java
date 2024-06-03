class Solution {
    public int countKeyChanges(String s) {
        String str=s.toLowerCase();
        int n=s.length();
        int c=0;
        for(int i=1;i<n-1;i++){
            if(str.charAt(i)!=str.charAt(i+1)){
                c++;
            
            }
        }
        return c;
    }
}