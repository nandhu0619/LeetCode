class Solution {
    public int splitNum(int num) {
        String s=""+num;
        char c[]=s.toCharArray();
        Arrays.sort(c);
        String st="";
        String l="";
        for(int i=0;i<c.length;i++){
            if(i%2==0){
                st+=c[i];
            }
            else{
                l+=c[i];
            }
        }
        int n=Integer.parseInt(st);
        int m=Integer.parseInt(l);
        return n+m;
    }
}