class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZero = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[lastNonZero] = nums[i];
                lastNonZero++;
            }
        }

        //for the rest, We'll put 0's.
        for(int i = lastNonZero; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}