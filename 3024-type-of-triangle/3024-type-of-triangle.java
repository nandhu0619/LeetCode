class Solution {
    public String triangleType(int[] n) {
        String ans="none";
        if(n[0]+n[1]>n[2]&&n[0]+n[2]>n[1]&&n[1]+n[2]>n[0]){
            if(n[0]==n[1]&&n[1]==n[2]){
            ans="equilateral";
        }
        else if(n[0]==n[1]||n[0]==n[2]||n[1]==n[2]){
            ans="isosceles";
        }
        else{
            ans="scalene";
        }
        }
        return ans;
    }
}