//https://leetcode.com/problems/destination-city/

class Solution {
    public String destCity(List<List<String>> paths) {
       HashMap<String, String> hm = new HashMap<String, String>();
       for(int i=0;i<paths.size();i++){
           String key = paths.get(i).get(0);
           String value = paths.get(i).get(1);
           hm.put(key,value);
       } 
       String result="";
       ArrayList<String> alValues = new ArrayList<String>(hm.values());
       ArrayList<String> alKeys = new ArrayList<String>(hm.keySet());
       for(int i=0;i<alValues.size();i++){
           if(!alKeys.contains(alValues.get(i))){
            result = alValues.get(i);
           }
       }
       
       return result;
    }
}
