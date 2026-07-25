class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int totalcount = 0;
        for (int num : nums){
            int temp = num;
            while(temp != 0){
                int rem = temp %10;
                if (rem == digit) {
                    totalcount++;
                }
                temp /= 10;
            }
        }
        return totalcount;
        
    }
}