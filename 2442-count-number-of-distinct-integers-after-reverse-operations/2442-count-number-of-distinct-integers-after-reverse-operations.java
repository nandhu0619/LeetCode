class Solution {
    public int countDistinctIntegers(int[] nums) {
       ArrayList<Integer> ar=new ArrayList<>();
       for(int nan:nums){
        ar.add(nan);
       } 
      
       for(int i: nums){
         int sum=0;
         int temp=i;
        while(temp>0){
            int rem=temp%10;
        sum=(sum*10)+rem;
        temp=temp/10;
        }
        ar.add(sum);
       }
      Set<Integer> distinctIntegers = new HashSet<>(ar);
        return distinctIntegers.size();
    }
}