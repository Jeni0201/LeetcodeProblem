class Solution {
    public boolean containsDuplicate(int[] nums) {
        int nlen=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<nlen-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
        

    }
}
