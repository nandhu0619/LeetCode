class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int max=0;
        for(Map.Entry<Integer,Integer>map:hm.entrySet()){
            int k=map.getKey();
            if(hm.containsKey(k-1)){
                int sum=hm.get(k)+hm.get(k-1);
                if(sum>max){
                    max=sum;
                }
            }
            if(hm.containsKey(k+1)){
                int sum=hm.get(k)+hm.get(k+1);
                if(sum>max){
                    max=sum;
                }
            }
        }
        return max;
    }
}