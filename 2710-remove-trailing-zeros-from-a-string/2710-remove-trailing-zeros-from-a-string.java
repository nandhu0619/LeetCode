class Solution {
    public String removeTrailingZeros(String num) {
        int n=num.length();
        StringBuilder sb=new StringBuilder(num);
        int j=n-1;
        while(j>=0 && sb.charAt(j)=='0'){
            sb.deleteCharAt(j);
            j--;
        }
        return sb.toString();
    }
}