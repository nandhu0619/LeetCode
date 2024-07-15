class Solution {
    public int averageValue(int[] nums) {
        ArrayList<Integer>li=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0 && nums[i]%3==0){
                li.add(nums[i]);
            }
        }
         if (li.isEmpty()) {
            return 0;
         }
        int sum=0;
        for(int i=0;i<li.size();i++){
            sum=sum+li.get(i);
        }
        int avg=sum/li.size();
        return avg;
    }
}