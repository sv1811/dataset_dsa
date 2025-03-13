

// User function Template for Java

class Solution {
    boolean findSwapValues(int[] a, int[] b) {
       
       int sumA = Arrays.stream(a).sum();
       int sumB = Arrays.stream(b).sum();
       int mid = (sumA+sumB)/2;
       int rem = (sumA+sumB)%2;
       if(rem == 1) {
           return false;
       }
       
       int diff = sumA>mid ? sumA-mid : mid-sumA;
    //   System.out.println(sumA + " == " + sumB + " --- " + diff);
       for(int i=0; i<a.length; i++) {
           for(int j=0; j<b.length; j++) {
            //   System.out.println(a[i] + " ==== " + b[j]);
               if(sumA>sumB && (a[i] - b[j]) == diff) {
                   return true;
               } else if (sumA<sumB && (b[j] - a[i]) == diff) {
                   return true;
               }
           }
       }
       return false;
    }
}