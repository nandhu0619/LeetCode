class Solution {
    public boolean isFascinating(int n) {
        int a=2*n;
        int b=3*n;
        String s=String.valueOf(n)+String.valueOf(a)+String.valueOf(b);
        int m=s.length();
        if(m!=9){
            return false;
        }
        if(s.length()==0){
                return false;
            }
        boolean[] digits = new boolean[10];
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            if (digit == 0 || digits[digit]) {
                return false;
            }
            digits[digit] = true;
        }

        return true;
    }
}