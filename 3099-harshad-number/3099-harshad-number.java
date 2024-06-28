class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int a=x;
        int sum=0;
        while(x>0){
            int n=x%10;
            sum=sum+n;
            x=x/10;
        }
        if(a%sum==0){
            return sum;
        }
        else{
            return -1;
        }
    }
}
