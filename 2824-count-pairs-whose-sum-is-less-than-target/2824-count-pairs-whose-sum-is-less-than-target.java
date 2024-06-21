class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int c=0;
        int s=0;
        int e=nums.size()-1;
        Collections.sort(nums);
        while(s<e){
            if(nums.get(s)+nums.get(e)<target){
                c=c+s-e;
                s++;
            }
            else{
                e--;
            }
        }
        return Math.abs(c);
    }
}