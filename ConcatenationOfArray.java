// https://leetcode.com/problems/concatenation-of-array/

public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int[] newArray = new int[nums.length * 2];
        for (int i=0; i<nums.length; i++) {
            newArray[i] = nums[i];
            newArray[nums.length + i] = nums[i];
        }
        return newArray;
    }
}
