class Solution {
    public static int triangularSum(int[] nums) {
        while (nums.length!=1) {
            int[] newNum = new int[nums.length-1];
            for (int i=0;i<newNum.length;i++) {
                newNum[i]=(nums[i]+nums[i+1])%10;
            }
            nums=newNum;
        }
        return nums[0];
    }
}