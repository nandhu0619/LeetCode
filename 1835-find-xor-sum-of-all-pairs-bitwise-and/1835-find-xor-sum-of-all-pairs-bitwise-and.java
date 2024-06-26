class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int c=0;
        int c1=0;
        for(int n:arr1){
            c=c^n;
        }
        for(int m:arr2){
            c1=c1^m;
        }
        return c&c1;
    }
}