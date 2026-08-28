class Solution {
    public int[] sortedSquares(int[] nums) {
        int numlen=nums.length;
        int[] res=new int[numlen];
        for(int i=0;i<numlen;i++){
            res[i]=nums[i]*nums[i];
        }
        Arrays.sort(res);
        return res;
    }
}
