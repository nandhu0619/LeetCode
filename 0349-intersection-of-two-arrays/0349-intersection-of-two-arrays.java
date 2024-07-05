class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        for(int num : nums1){
            set1.add(num);
        }
        ArrayList<Integer> li=new ArrayList<>();
        for(int num:nums2){
            if(set1.contains(num)){
                li.add(num);
                set1.remove(num);
            }
        }
        int arr[]=new int[li.size()];
        for(int i=0;i<li.size()-1;i++){
            arr[i]=li.get(i);
        }
        return arr;
    }
}