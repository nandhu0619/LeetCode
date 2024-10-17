class Solution {
    public int[] evenOddBit(int n) {
        int arr[]=new int[2];
        int e=0;
        int o=0;
        String s=Integer.toBinaryString(n);
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
              if((s.length()-i-1)%2==0){
                e++;
              }
              else{
                o++;
              }
            }
            
        }
        arr[0]=e;
        arr[1]=o;
        return arr;
    }
}