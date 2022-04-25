// https://leetcode.com/problems/missing-number/

class MissingNumber {
    public int missingNumber(int[] nums) {
        int i  = 0;
        while (i < nums.length) {
            if (nums[i] < nums.length && nums[i] != nums[nums[i]]) {
                swap(nums, i, nums[i]);
            } else {
                i++;
            }
        }
        // search for first missing number
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j){
                return j;
            }
        }
        // case 2
        return nums.length;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}