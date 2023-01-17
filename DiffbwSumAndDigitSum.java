//https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/description/

class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(nums[i]>0){
                sum2+=nums[i]%10;
                nums[i]=nums[i]/10;
            }
        }
        return Math.abs(sum-sum2);
    }
}
