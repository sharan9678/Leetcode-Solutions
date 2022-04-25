// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

public class SubtractProductAndSum {
    public int subtractProductAndSum(int n) {
        int prod = 1;
        int sum = 0;
        while (n != 0) {
            int temp = n % 10;
            n /= 10;
            prod *= temp;
            sum += temp;
        }
        return prod - sum;
    }
}