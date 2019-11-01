package leetcode;

public class ReversInteger {

    public static int reverse(int in){
        if(in==0) return in;
        long res =0L;
        while(in!=0){
            res = in%10+res*10;
            in = in/10;
            if(res>Integer.MAX_VALUE || res<Integer.MIN_VALUE) return 0;
        }
        return (int)res;
    }
}
