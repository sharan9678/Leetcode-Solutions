// https://leetcode.com/problems/running-sum-of-1d-array/

public class RunningSumOf1DArray {
    public int[] runningSum(int[] nums) {
        int[] newArray = new int[nums.length];
        int sum = 0;
        for (int i=0; i<nums.length; i++) {
            sum = sum + nums[i];
            newArray[i] = sum;
        }
        return newArray;
    } 
}
