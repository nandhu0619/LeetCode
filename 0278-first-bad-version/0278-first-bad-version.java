/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n==1){
            return 1;
        }
        else if(n==2){
            return 2;
        }
        else{
            return n-1;
        }
        
    }
}