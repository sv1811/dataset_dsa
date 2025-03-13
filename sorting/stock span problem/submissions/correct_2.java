


class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>(n);
        
        for(int i = 0; i<n ; i++){
            res.add(0);
        }
        
        res.set(0,1);
        Stack<Integer> st = new Stack<>();
        st.push(0);
        
        for(int i = 1;i<n ; i++){
            while(st.size()!=0&&arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()) res.set(i,i+1);
            else res.set(i,(i-st.peek()));
            st.push(i);
        }
        
        return res;
    }
}