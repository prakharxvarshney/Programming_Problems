class Solution {
    public static int countBalls(int lowLimit, int highLimit) {
        int arr[] = new int[highLimit];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=lowLimit;i<=highLimit;i++) {
            int n = digitSum(i);
            if(!map.containsKey(n)) {
                map.put(n,1);
            }
            else {
                map.put(n,map.get(n)+1);
            }
        }
        return Collections.max(map.values());
    }

    public static int digitSum(int num) {
        int n = 0;
            while (num > 0) {
                int temp = num%10;
                n=n+temp;
                num/=10;
            }
            return n;
    }
}