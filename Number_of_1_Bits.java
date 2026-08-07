class Solution {
    public int hammingWeight(int n) {
        int onebt=0;
        while(n>0){
            onebt += n%2;
            n=Math.floorDiv(n,2);
        }
        return onebt;
    }

}
