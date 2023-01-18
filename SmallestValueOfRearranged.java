//https://leetcode.com/problems/smallest-value-of-the-rearranged-number/description/

class Solution {
    public long smallestNumber(long num) {
         long res=0;
         if(num==0)
         return res;
        if(num<0){
             ArrayList<Long> al= new ArrayList<Long>();
            long a=0;
            int count=0;
            num=Math.abs(num);
            while(num>0){
                a=num%10;
                if(a==0)
                count++;
                else
                al.add(a);

                num=num/10;
            }
             Collections.sort(al);
           
            for(int i=al.size()-1;i>=0;i--){
            res=res*10+al.get(i);
            }
             while(count>0){
                res=res*10;
                count--;
            }
            res=res-res*2;
        }
        
        else{
            ArrayList<Long> al= new ArrayList<Long>();
            long a=0;
            int count=0;
            while(num>0){
                a=num%10;
                if(a==0)
                count++;
                else
                al.add(a);

                num=num/10;
            }
            Collections.sort(al);
           
            res=res*10+al.get(0);
            while(count>0){
                res=res*10;
                count--;
            }
            for(int i=1;i<al.size();i++){
            res=res*10+al.get(i);
            }
        }
        return res;

    }
}
