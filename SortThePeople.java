//https://leetcode.com/problems/sort-the-people/description/

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
        for(int i=0;i<names.length;i++){
            hm.put(heights[i],names[i]);
        }
        ArrayList<String> al = new ArrayList<String>(hm.values());

        String output[] = new String[names.length];
        int j=0;
        for(int i=output.length-1;i>=0;i--){
            output[j]=al.get(i);
            j++;
        }
    return output;
    }
}
