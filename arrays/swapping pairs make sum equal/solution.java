

// User function Template for Java


class Solution {
    boolean findSwapValues(int[] a, int[] b) {
        // Calculate the sum of both arrays
        int sumA = 0, sumB = 0;
        
        for (int num : a) {
            sumA += num;
        }
        
        for (int num : b) {
            sumB += num;
        }

        // Calculate the target value
        int target = (sumA - sumB) / 2;

        // If the target is not an integer, return false
        if ((sumA - sumB) % 2 != 0) {
            return false;
        }

        // Use a HashSet to store elements of array b
        HashSet<Integer> setB = new HashSet<>();
        for (int num : b) {
            setB.add(num);
        }

        // Check if we can find a valid pair (x, y)
        for (int numA : a) {
            int requiredBValue = numA - target;
            if (setB.contains(requiredBValue)) {
                return true;
            }
        }

        return false; // No pair found
    }
}