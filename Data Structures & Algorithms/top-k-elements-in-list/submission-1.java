class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> arr = new HashMap<>();

        for (int num : nums) {
            arr.put(num, arr.getOrDefault(num, 0) + 1);
        }

    
        ArrayList<Integer> list = new ArrayList<>(arr.keySet());

    
        list.sort((a, b) -> arr.get(b) - arr.get(a));

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}