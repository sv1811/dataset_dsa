


class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // write code here
        ArrayList<Integer> a = new ArrayList<>();
        int count = 1;
        for (int i=0; i<arr.length; i++) {
            count = 1;
            for (int j=0; j<i; j++) {
                if(arr[i]>arr[j]){
                    count++;
                }
            }
            a.add(count);
        }
        return a;
    }
}