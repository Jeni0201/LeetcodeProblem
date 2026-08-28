class Solution {
    public int[] topKFrequent(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num:nums){
            if(!map.containsKey(num)){
                map.put(num, 1);
            }
            else{
                map.put(num, map.get(num) + 1);
            }
        }
        ArrayList<Map.Entry<Integer, Integer>>list=new ArrayList<>(map.entrySet());
        Collections.sort(list, (a,b) -> b.getValue() - a.getValue());
        int[] ans = new int[k];
        for(int i=0; i<k; i++){
            ans[i] = list.get(i).getKey();
        }
        return ans;
    }
}
