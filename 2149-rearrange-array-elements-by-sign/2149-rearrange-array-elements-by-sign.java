class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int [] ans=new int[n];
        ArrayList<Integer> p=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                p.add(nums[i]);
            }
            else{
                neg.add(nums[i]);
            }
        }
        int pind=0,nind=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                ans[i]=p.get(pind);
                pind++;
            }
            else{
                ans[i]=neg.get(nind);
                nind++;
            }
        }
        return ans;
        }
    }
