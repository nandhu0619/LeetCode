class Solution {
    public int minOperations(String[] logs) {
        int n=logs.length;
        int c=0;
        for(int i=0;i<n;i++){
            if(!logs[i].equals("../")&& !logs[i].equals("./")){
                c++;
            }else if(logs[i].equals("../")){
                if(c!=0)
                    c--;
            }
        }
        return c;
    }
}