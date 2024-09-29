package org.verse.lee.c1;

public class Solution {
    
    
    public static void main(String[] args) {
        
        Solution solution = new Solution();
        // int[] nums = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
                int[] nums = solution.twoSum(new int[]{3,2,4}, 6);
        System.out.println(nums[0] + " " + nums[1]);
        
        
    }
    
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length ;
        for (int i = 0; i < nums.length ; i++) {
            System.out.println("1");
            for (int j = i + 1; j < len; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
