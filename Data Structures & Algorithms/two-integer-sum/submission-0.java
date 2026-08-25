class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int[] indexes = new int[2];
        outerloop:
        for(int i = 0; i<nums.length; i++) {
            for(int j = i+1; j<nums.length; j++) {
                sum = nums[i] + nums[j];
                if(sum == target) {
                    indexes[0] = i;
                    indexes[1] = j;
                    break outerloop;
                }
            }
        }
        return indexes;
    }
}
