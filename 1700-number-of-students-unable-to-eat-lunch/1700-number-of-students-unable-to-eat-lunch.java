class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st1=new Stack<>();
        Deque<Integer> dq=new LinkedList<>();
        int n=students.length;
        for(int i=0;i<n;i++){
            dq.offer(students[i]);
        }for(int i=sandwiches.length-1;i>=0;i--){
            st1.push(sandwiches[i]);
        }
        int r=0;
        while(!dq.isEmpty()&& r<st2.size()){
            if(st1.peek()==dq.peek()){
            dq.poll();
            st1.pop();
            r=0;
        }
        else{
            dq.offer(dq.poll());
            r++;
        }
        }
        return dq.size();
    }
}