//https://leetcode.com/problems/first-letter-to-appear-twice/description/

class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> hs = new HashSet<Character>();
        char res='a';
        for(int i=0;i<s.length();i++){
            if(!hs.contains(s.charAt(i)))
          hs.add(s.charAt(i));
          else{
           res=s.charAt(i);
           break;
          }
          
        }
     return res;
    }
}
