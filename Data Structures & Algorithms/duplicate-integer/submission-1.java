class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer ,Integer> arr = new HashMap<>();

        for(int num:nums){
            arr.put(num,arr.getOrDefault(num, 0)+1);
        }

        for(int a: arr.keySet()){
            if(arr.get(a)>1){
                return true;
            }

        }
        return false;
        
    }
}