
class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character,Integer> arr = new HashMap<>();
        HashMap<Character,Integer> arr1 = new HashMap<>();

        for(char a: s.toCharArray()){
            arr.put(a,arr.getOrDefault(a,0)+1);
        }

        for(char b: t.toCharArray()){
            arr1.put(b,arr1.getOrDefault(b,0)+1);
        }

       

        if(arr.equals(arr1)){
            return true ;
        }

        return false;



    }
}
