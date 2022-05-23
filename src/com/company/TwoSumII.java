package com.company;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int[] newArray = new int[2];
        int j = numbers.length-1;
        int i = 0;
        while(i<j){
            int currentSum = numbers[i] + numbers[j];
            if(currentSum == target){
                return new int[]{i+1, j+1};

            }else if(currentSum > target){
                j--;
            }else if(currentSum < target){
                i++;
            }
        }
        return new int[]{0, 0};
    }
}
