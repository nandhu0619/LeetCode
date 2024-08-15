class Solution {
    public int[] decode(int[] encoded) {
        int n=encoded.length+1;
        int total_xor=0;
        for(int i=1;i<=n;i++){
            total_xor^=i;
        }
        int enc_xor=0;
        for(int i=1;i<encoded.length;i=i+2){
            enc_xor^=encoded[i];
        }
        int arr[]=new int[n];
        int first=total_xor^enc_xor;
        arr[0]=first;
        for(int i=0;i<encoded.length;i++){
            arr[i+1]=arr[i]^encoded[i];
        }
        return arr;
    }
}