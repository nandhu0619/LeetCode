class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[0]==0){
            for(int i=0;i<2;i++){
                if(nums[i]==0){
                    nums[i]=1;
                }
                if(nums[i]==1){
                    nums[i]=0;
                }
            }
            
        }
        }
    }
}