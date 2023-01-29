//https://leetcode.com/problems/decode-the-message/description/

class Solution {
    public String decodeMessage(String key, String message) {
        StringBuffer output = new StringBuffer();
         key= key.replaceAll("\\s", "");
         StringBuffer keyFinal = new StringBuffer();
         LinkedHashSet<Character> key1 = new LinkedHashSet<>();
         for(int i=0;i<key.length();i++){
             key1.add(key.charAt(i));
         }
         for(Character ch2 : key1){
           keyFinal.append(ch2);
         }
        for(int i=0;i<message.length();i++){
            char ch = message.charAt(i);
            if(ch!=' '){
            int pos = keyFinal.indexOf(String.valueOf(ch));
            char ch1 = (char)(97+pos);
            output.append(ch1);
            }
            else
            output.append(" ");
        }
        return String.valueOf(output);

    }
}
