package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int [] arr){
        List<List<Integer>> lists = new ArrayList<>();
        if(arr.length<3) return lists;
        Arrays.sort(arr);

        for (int i=0;i<arr.length-2;i++){
            int height = arr.length-1, low =i+1,target=0-arr[i];
            while(height>low && low>=0 && height<arr.length){
              if(target== arr[height]+arr[low]){
                  lists.add(Arrays.asList(arr[low],arr[height],arr[i]));
                  while(height>low && arr[low]==arr[low+1]) low++;
                  while(height>low && arr[height] == arr[height-1]) height--;
              }else if(target>arr[height]+arr[low]){
                  low++;
              }else{
                  height--;
              }
            }
        }
           return lists;
    }
}
