class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=Math.abs(nums[i]-nums[j]);
            }
            arr[i]=sum;
        }
        return arr;
    }
}