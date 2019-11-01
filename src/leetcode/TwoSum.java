package leetcode;

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums,int target){
        if(nums == null || nums.length <2){
            return new int[]{-1,-1};
        }
        int [] res = new int[]{-1,-1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(map.containsKey(target-num)){
                res[0] = map.get(target-num);
                res[1] = i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
    }
}
