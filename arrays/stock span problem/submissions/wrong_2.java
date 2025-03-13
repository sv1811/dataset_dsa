


class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList<Integer> spans = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        s.push(0);
        spans.add(1);
        for (int i =1; i < arr.length; i++) {
            while(!s.isEmpty()) {
                int top = s.peek();
                if (arr[top] > arr[i]) {
                    s.push(i); 
                    spans.add(i - top);
                    break;
                } else {
                    s.pop();
                }
            }
            if (s.isEmpty()) {
                spans.add(i);
            }
        }
        
        return spans;
        // write code here
    }
}