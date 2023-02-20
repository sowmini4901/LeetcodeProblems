//https://leetcode.com/problems/contains-duplicate-ii/description/

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean result= false;
        ArrayList<Integer> hs = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i])){
               int a = hs.indexOf(nums[i]);
               int b = i;
               if(Math.abs(a-b)<=k){
               result=true;
               break;
               }
               hs.add(nums[i]);
            }
            else{
                hs.add(nums[i]);
            }
        }
        return result;
    }
}
