class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int count=0;
        Arrays.sort(seats);
        Arrays.sort(students);
        int n=seats.length;
        int []nandhu=new int[n];
        for(int i=0;i<n;i++){
            nandhu[i]=students[i]-seats[i];
        }
        for(int i=0;i<n;i++){
            count=count+nandhu[i];
        }
        return Math.abs(count);
    }
}