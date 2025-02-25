// Emily runs a bakery and tracks the monthly profits and losses of her business over a period of time. She wants to calculate her maximum net profit by removing one continuous subarray (one or more consecutive months) with the highest loss (i.e., the subarray with the smallest sum).



// However:

// If all months have only one loss, no subarray is removed.
// Otherwise, she removes the continuous subarray with the most significant loss, and the rest of the months contribute to the net profit.


// Your task is to help Emily determine the maximum possible net profit she can achieve after following these rules.



// Example



// Input:

// 6

// 1000 -200 300 -500 400 300

// Output:

// 1800

// Explanation:

// The month in which the business performed poorly was with a loss of 500. So, after ignoring that month, the net profit is 1000-200+300+400+300 = 1800.

// Input format :
// The first line of input consists of an integer N, representing the number of monthly profit/loss records.

// The second line consists of N space-separated integers, each representing the profit or loss for each month (Negative values represent losses).

// Output format :
// The output prints a single integer representing the net profit.



// Refer to the sample output for formatting specifications.

// Code constraints :
// 1 ≤ N ≤ 10

// Sample test cases :
// Input 1 :
// 4
// 500 -200 100 300
// Output 1 :
// 900
// Input 2 :
// 6
// 1000 -200 300 -500 400 300
// Output 2 :
// 1800



class ExpenseAnalyzer {
    public int calculateMaxRemainingBudget(int[] expenses) {
        int totalSum = 0;
        int minSubarraySum = Integer.MAX_VALUE;
        int currentSubarraySum = 0;
        boolean hasLoss = false;
        
        for (int expense : expenses) {
            totalSum += expense;
            if (expense < 0) {
                hasLoss = true;
            }
        }
        
        if (!hasLoss) {
            return totalSum;
        }
        
        for (int i = 0; i < expenses.length; i++) {
            currentSubarraySum = 0;
            for (int j = i; j < expenses.length; j++) {
                currentSubarraySum += expenses[j];
                minSubarraySum = Math.min(minSubarraySum, currentSubarraySum);
            }
        }
        
        return totalSum - minSubarraySum;
    }
}