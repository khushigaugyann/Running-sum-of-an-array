public class RunningSum {
    public static int[] runningSum(int[] nums) {
        // Loop through the array and add the previous element to the current element
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        // Return the modified array
        return nums;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 4 };

        int[] sum = runningSum(arr);
        for (int i = 0; i < sum.length; i++) {
            System.out.println(sum[i]);
        }
    }
}
