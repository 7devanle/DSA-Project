package com.company;

public class TwoSumsI {
    public static void main(String[] args) {
        int[] nums = {2,45,22,11, 22, 34, 2, 78, 21, 9, 33,7,3,4};
        int[] numbers = twoSum2(nums, 56);
        System.out.println(numbers[0] + " " + numbers[1]);

        int[] numbs = {2,4,12,15,21,45};
         int[] number = twoSum2(numbs, 49);
        System.out.println(number[0] + " " + number[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
//        OofN for sorted arrays
        int j;
        j = nums.length-1;
        int[] newArray = new int[2];
//        for(int i = 0; i<nums.length && j>0; i++, j--)
        for(int i = 0; i<nums.length && j>0; i++, j--){
            if(nums[i] + nums[j] == target){
                newArray[0] = i;
                newArray[1] = j;
                return newArray;

            }else if(nums[i] + nums[j] > target){
                i--;
            }else if(nums[i] + nums[j] < target){
                j++;
            }
        }
        return new int[]{0, 0};
    }

    public static int[] twoSum2(int[] nums, int target) {
        //Onsquare
        for(int i = 0; i<nums.length; i++){
            for(int j = 1; j<nums.length; j++){
                if ((nums[i] + nums[j]) == target && i != j){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0, 0};
    }
}
