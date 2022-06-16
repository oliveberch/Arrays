class MaxSumSubseq{
    int findMaxSumSubsequence(int[] arr, int i, int n, int prev)
    {
        if (i == n) {
            return 0;
        }
        int excl = findMaxSumSubsequence(arr, i + 1, n, prev);
        int incl = 0;
        if (prev + 1 != i) {
            incl = findMaxSumSubsequence(arr, i + 1, n, i) + arr[i];
        }
        return Integer.max(incl, excl);
    }
    void main(String[] args)
    {
        int[] nums = { 1, 2, 9, 4, 5, 0, 4, 11, 6 };
        System.out.print("The maximum sum is "
                + findMaxSumSubsequence(nums, 0, nums.length, Integer.MIN_VALUE));
    }
}