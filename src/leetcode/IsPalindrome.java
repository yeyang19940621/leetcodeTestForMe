package leetcode;

public class IsPalindrome {

    public boolean isPalindrome(int in){
         if(in <0 || (in!=0 && in%10==0)) return false;
         int out=0;
         int inc = in;
         while(inc != 0){
             out = out*10+inc%10;
             inc = inc/10;
         }
         return out==in;
    }
}
