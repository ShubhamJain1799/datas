public  class robbery {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        } else if (n == 0) {
            return 0;

        } else if (n == 2) {
            return Math.max(nums[0], nums[1]);

        }
        int[] rob1 = new int[n];
        rob1[0] = nums[0];
        rob1[1] = Math.max(nums[0], nums[1]);

        // Fill the DP table using the recurrence relation
        for (int i = 2; i < n; i++) {
            rob1[i] = Math.max(rob1[i - 1], rob1[i - 2] + nums[i]);
        }

        return rob1[n - 1];
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};

        robbery robObj = new robbery();
        int maxMoney = robObj.rob(nums);

        System.out.println("Maximum money that can be robbed: " + maxMoney);
    }
}