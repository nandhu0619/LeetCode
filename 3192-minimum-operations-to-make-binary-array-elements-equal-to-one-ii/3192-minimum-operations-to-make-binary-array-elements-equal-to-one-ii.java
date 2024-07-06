class Solution {
    public int minOperations(int[] nums) {
        int ans = 0;
        int t=0;
        int n = nums.length;
        for (int i =0;i<n;i++) {
            if(nums[i]!=t) continue;
            ans++;
            t=t^1;
        }
        return ans;
    }
}