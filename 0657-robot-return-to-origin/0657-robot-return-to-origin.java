class Solution {
    public boolean judgeCircle(String moves) {
        int r=0,l=0,u=0,d=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='R') r++;
            if(moves.charAt(i)=='L') l++;
            if(moves.charAt(i)=='U') u++;
            if(moves.charAt(i)=='D') d++;
        }
        return (l==r)&& (u==d);
    }
}