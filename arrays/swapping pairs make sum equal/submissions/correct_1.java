

// User function Template for Java

class Solution {
    boolean findSwapValues(int[] a, int[] b) {
        // Your code goes here
        int sumA=0;
        int sumB=0;
        for(int num: a) sumA+=num;
        for(int num: b) sumB+=num;
        
        if((sumB-sumA)%2!=0) return false;
        
        int tarDiff=(sumB-sumA)/2;
        
        HashSet<Integer> setB=new HashSet<>();
        for(int num: b) setB.add(num);
        
        for(int x:a){
            int y=x+tarDiff;
            if(setB.contains(y)) return true;
        }
        return false;
    }
}