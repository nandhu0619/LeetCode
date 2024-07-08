class Solution {
    public int sumOfMultiples(int n) {
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i %3==0||i%5==0||i%7==0){
                li.add(i);
            }
        }
        int sum=0;
        for(int i=0;i<li.size();i++){
            sum=sum+li.get(i);
        }
        return sum;
    }
}