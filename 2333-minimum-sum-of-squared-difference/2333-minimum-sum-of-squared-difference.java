class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {

        long k = (long) k1 + k2;
        int length = nums1.length;

        int[] arr1 = new int[length];
        long sumOfArr1 = 0;
        int maxOfArr1 = 0;

        // Step 1: diff banao, sum aur max nikalo
        for (int i = 0; i < length; i++) {
            arr1[i] = Math.abs(nums1[i] - nums2[i]);
            sumOfArr1 = sumOfArr1 + arr1[i];
            if (arr1[i] > maxOfArr1) {
                maxOfArr1 = arr1[i];
            }
        }

        // Step 2: sab ko 0 kar sakte hain
        if (sumOfArr1 <= k) {
            return 0;
        }

        // Step 3: count array (Java mein by default sab 0 hota hai)
        int[] countArr = new int[maxOfArr1 + 1];
        for (int i = 0; i < length; i++) {
            countArr[arr1[i]]++;
        }

        // Step 4: sabse bade level se neeche aao
        int d = maxOfArr1;

        while (d > 0 && k > 0) {
            int c = countArr[d];

            if (c <= k) {
                // poora group ek level neeche
                k = k - c;
                countArr[d - 1] = countArr[d - 1] + c;
                countArr[d] = 0;
                d = d - 1;
            } else {
                // sirf k elements neeche, phir ruk jao
                countArr[d] = countArr[d] - (int) k;
                countArr[d - 1] = countArr[d - 1] + (int) k;
                k = 0;
            }
        }

        // Step 5: final answer
        long result = 0;
        for (int i = 0; i < countArr.length; i++) {
            result = result + (long) countArr[i] * i * i;
        }
        return result;
    }
}