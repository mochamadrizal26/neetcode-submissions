class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] ans = new int[size*2];

        for(int i=0; i<nums.length; i++) {
            ans[i] = nums[i];
            ans[size+i] = nums[i];
        }

        return ans;
    }
}