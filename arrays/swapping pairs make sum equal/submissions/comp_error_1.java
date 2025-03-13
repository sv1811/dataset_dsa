

// User function Template for Java

class Solution {
    long findSwapValues(long a[], int n, long b[], int m) {
        Arrays.sort(a);
        Arrays.sort(b);
        long sum1 = 0;
        long sum2 = 0;
        for(int i=0;i<n;i++){
            sum1 += a[i];
        }
        for(int j=0;j<m;j++){
            sum2 += b[j];
        }
        int i=0;
        int j=0;
        while(i<n && j<m){
            long temp1 = sum1 - a[i] + b[j];
            long temp2 = sum2 - b[j] + a[i];
            if(temp1 == temp2){
                return 1;
            }
            else if(temp1 > temp2){
                i++;
            }
            else{
                j++;
            }
        }
        return -1;
    }
}