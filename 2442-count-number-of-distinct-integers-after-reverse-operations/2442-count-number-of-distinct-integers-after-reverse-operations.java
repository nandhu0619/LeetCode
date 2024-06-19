class Solution {
    public int countDistinctIntegers(int[] nums) {
       ArrayList<Integer> ar=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
        ar.add(nums[i]);
       } 
       int sum=0;
       for(int i=0;i<nums.length;i++){
        
        int rem=nums[i]%10;
        sum=(sum*10)+rem;
        nums[i]=nums[i]/10;
        ar.add(nums[i]);
       }
       int c=0;
       
        ArrayList<Integer> newList = new ArrayList<>();
        for (int element : ar) {
            if (!newList.contains(element)) { 
                newList.add(element);
            }
        }
       return newList.size();
    }
}