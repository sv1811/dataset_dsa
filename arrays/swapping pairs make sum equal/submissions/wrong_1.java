

// User function Template for Java

class Solution {
    boolean findSwapValues(int[] a, int[] b) {
      
      /*  6, 13
        5,7,4,6  22 -6 +2 = 18  -2 1,7.4.6= 18 5,2,3,8
        1,2,3,8  14 -2+6  = 18   +2
        4,1,2,1,1,2  11  13     +2 -2
        3,6,3,3      15  13     14
        // Your code goes here
        */
        
        int sumA =0; int sumB=0;
        int maxLen= a.length>b.length?a.length:b.length;
        Set<Integer> setA = new HashSet<>();
       // Set<Integer> setB = new Hashset<>();
        for(int i=0;i<maxLen;i++){
            
            if(i<a.length){
                sumA+=a[i];
                setA.add(a[i]);
            }
            if(i<b.length){
                sumB+=b[i];
                //setB.add(b[i]);
            }
            
            
        }
        
        int target= (sumA-sumB)/2;
        if(target%2!=0){
            return false;
        }
      // System.out.println(target+":target");
        for(int i=0;i<b.length;i++){
            
            int complement = target+b[i];
            
            if(setA.contains(complement)){
                
                return true;
            }
            
        }
        
        return false;
        
        
    }
}