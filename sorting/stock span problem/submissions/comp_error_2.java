


class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // write code here
         ArrayList<Integer> span=new ArrayList<>();
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            int currPrice=arr[i];
            while(!s.isEmpty() && currPrice>=arr[s.peek()])
            {
                s.pop();
            }
            if(s.isEmpty())
                span.add(i,i+1);
            else{
                int prevHigh=s.peek();
                span.add(i,i-prevHigh);
            }
            s.push(i);
        }
        return span;
    }
}