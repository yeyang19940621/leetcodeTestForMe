package leetcode;

public class ContainerWithMostWaster {

    public static int  maxArea(int [] height){
        int l=0;
        int r = height.length-1;
        int res=0;
        while(l<r){
            int tmp = (l-r+1)*Math.min(height[r],height[l]);
            if(tmp>res){
                res = tmp;
            }
            l = height[l]>=height[r] ? l:l+1;
            r = height[l]>=height[r] ? r-1:r;
        }
        return res;

    }
}
