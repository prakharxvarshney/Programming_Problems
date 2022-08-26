class Solution {
    public static int maxSubArray(int[] nums) {
        int min=Integer.MIN_VALUE;
        int max=0;
        for (int i=0;i<nums.length;i++) {
            max+=nums[i];
            if(min<max) min=max;
            if(max<0) max=0;
        }
        return min;
    }
}