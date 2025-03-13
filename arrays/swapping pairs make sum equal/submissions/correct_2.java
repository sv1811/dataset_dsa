

// User function Template for Java

class Solution {
    int sum(int[] a){
        int s = 0;
        for(int i=0;i<a.length;i++){
            s = s + a[i];
        }
        return s;
    } 
    
    boolean findSwapValues(int[] a, int[] b) {
        // Your code goes here
        int n = a.length;
        int m = b.length;
        if(sum(a) == sum(b)) return true;
        int diff = Math.abs(sum(a)-sum(b));
        if(diff%2==1){
            return false;
        }
           if(sum(a)<sum(b)){
            Set<Integer> s = new HashSet<>();
            for(int i : b)s.add(i);
            
            int adj = diff/2;
            
            for(int i : a){
                if(s.contains(i+adj)) return true;
            }
        } else{
            Set<Integer> s = new HashSet<>();
            for(int i : a) s.add(i);
            
            int adj = diff/2;
            
            for(int i : b){
                if(s.contains(i+adj)) return true;
            }
        }
        return false;
    }
}