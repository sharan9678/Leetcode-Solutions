// https://leetcode.com/problems/richest-customer-wealth/

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        for (int i=0; i<accounts.length; i++) {
            int temp = 0;
            for (int j=0; j<accounts[i].length; j++) {
                temp += accounts[i][j];
            }
            if (temp > sum) {
                sum = temp;
            }
        }
        return sum;
    }
}
