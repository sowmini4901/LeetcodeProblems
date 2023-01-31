//https://leetcode.com/problems/keep-multiplying-found-values-by-two/description/

class Solution {
    public int findFinalValue(int[] nums, int original) {
        int count=0;
        int j=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]%original==0 && original*(int)Math.pow(2,j)==nums[i]){
              count++;
              j++;
            }
        }
        int res = original*(int)Math.pow(2,count);
        return res;
    }
}
