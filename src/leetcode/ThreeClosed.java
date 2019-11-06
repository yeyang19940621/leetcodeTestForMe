package leetcode;

import java.util.Arrays;

public class ThreeClosed {


    public int threeClosed(int[] nums ,int target){
        if(nums.length<3) return Integer.MAX_VALUE;
        Arrays.sort(nums);
        int res = nums[0]+nums[1]+nums[nums.length-1];

        for (int i = 0; i <nums.length-2 ; i++) {
            int low=i+1,height=nums.length-1;
            while(low<height){
                int out = nums[low]+nums[height]+nums[i];
                if(out>target){
                    low--;
                }else {
                    height++;
                }
                if(Math.abs(res-target)>Math.abs((out-target))){
                    res = out;
                }
            }
        }
        return res;
    }
}
