


class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
   Stack<Integer> s=new Stack<>();
         ArrayList<Integer> ans= new ArrayList<>();
         int n = arr.length;
         
         for (int i=0;i<n;i++){
           
                 while(!s.isEmpty()&&arr[s.peek()] <= arr[i]){
                     s.pop();
                 }
            
            ans.add(s.isEmpty()?i+1:i-s.peek());
            s.push(i);

         }
        
        return ans;
        }
}