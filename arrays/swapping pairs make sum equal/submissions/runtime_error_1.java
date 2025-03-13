

// User function Template for Java

class Solution {
    boolean findSwapValues(int[] a, int[] b) {
        // Your code goes here
        Arrays.sort(a);
        Arrays.sort(b);
        
        int sumA = Arrays.stream(a).sum();
        int sumB = Arrays.stream(b).sum();
        
        int i = 0;
        int j = 0;
        
        int n = a.length;
        int m = b.length;
        
    
        while(i < n && j < m){
            
            int newSumA = sumA - a[i] + b[j];
            int newSumB = sumB - b[i] + a[i];
            
            if(newSumA > newSumB){
                i++;
            }
            else if(newSumA < newSumB){
                j++;
            }
            else{
                return true;
            }
        }
        return false;
    }
}