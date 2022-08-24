class Solution {
        public static void rotate(int[] nums, int k) {
        int[] num = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            num[i]=nums[i];
        }
        for(int i=0;i<nums.length;i++) {
            int n = (i+k)%nums.length;
            nums[n] = num[i];
        }
    }
}