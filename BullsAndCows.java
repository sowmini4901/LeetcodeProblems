//https://leetcode.com/problems/bulls-and-cows/

class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<secret.length();i++){
            al.add(secret.charAt(i)-'0');
        }
        for(int i=0;i<guess.length();i++){
           if(secret.charAt(i)==guess.charAt(i))
           bulls++;
           else if(al.contains(guess.charAt(i)-'0')){
           al.removeAll(Collections.singleton(Integer.valueOf(guess.charAt(i)-'0')));
           cows++;
           }

        }
        
        String res = bulls+"A"+cows+"B";
        return res;
    }
}
