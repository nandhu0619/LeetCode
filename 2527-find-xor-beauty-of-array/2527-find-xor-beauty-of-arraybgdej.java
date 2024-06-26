class Solution {
    public int xorBeauty(int[] nums) {
        int n=0;
        for(int m:nums){
            n=n^m;
        }
        return n;
    }
}