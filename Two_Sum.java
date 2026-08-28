class Solution {
    public int[] twoSum(int[] nums, int target) {
        int numlen = nums.length;
        for (int i = 0; i < numlen; i++) {
            for (int j = i + 1; j < numlen; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j }; 
                }
            }
        }

        return new int[] {}; 
    }
}
