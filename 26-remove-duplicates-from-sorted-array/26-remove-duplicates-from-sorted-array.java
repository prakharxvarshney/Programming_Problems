class Solution {
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for(int i=1;i<nums.length;i++) {
            if(nums[i]==nums[i-1]) {
                count=count+1;
            }
            nums[i-count]=nums[i];
        }
        return nums.length-count;
    }
}