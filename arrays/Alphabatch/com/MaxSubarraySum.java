package Alphabatch.com;

public class MaxSubarraySum {
    public static void main(String[] args) {
        int [] arr = {2,4,6,8,10};
        maxSumOfSubArray(arr);
    }

    public static void maxSumOfSubArray(int[] arr){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum Sum : " + maxSum);
    }
}
