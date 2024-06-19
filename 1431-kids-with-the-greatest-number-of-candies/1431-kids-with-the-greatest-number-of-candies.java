class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ar=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int candy:candies){
            max=Math.max(max,candy);
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                ar.add(true);
            }
            else{
                ar.add(false);
            }
        }
        return ar;
    }
}