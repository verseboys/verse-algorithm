package org.verse.lee.c27;

public class Solution {
    

        public int removeElement(int[] nums, int val) {
            int n = nums.length;
            int left = 0;
            for (int right = 0; right < n; right++) {
                if (nums[right] != val) {
                    nums[left] = nums[right];
                    left++;
                }
            }
            return left;
        }
    
    public int[] removeElementA(int[] nums, int val) {
        int n = nums.length;
        int left = 0;
        for (int right = 0; right < n; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
        return nums;
    }
  
    public int removeElementD(int[] nums, int val) {
        int index = 0;
        for(int num : nums){
            if(num != val){
                nums[index++] = num;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {3,2,2,3};
        int val = 3;
        System.out.println(s.removeElementD(nums, val));
        System.out.println(s.removeElementA(nums, val));
    }
}
