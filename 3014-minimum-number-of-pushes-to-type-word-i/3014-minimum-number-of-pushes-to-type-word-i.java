class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int count=1;
        int sum=0;
        int i=1;
        for(char c: word.toCharArray()){
            if(i>8){
                i=2;
                count++;
            }
            else{
                i++;
            }
            sum=sum+count;
        }
        return sum;
    }
}