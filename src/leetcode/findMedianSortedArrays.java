package leetcode;

public class findMedianSortedArrays {

    public double findMedianSortedArrays(int[] nums1,int[] nums2){
        if(nums1.length>nums2.length){
            return findMedianSortedArrays(nums2,nums1);
        }
          int len = nums1.length+nums2.length;
          int cut1 = 0;
          int cut2 = 0;
          int cutL = 0;
          int cutR = nums1.length;
          while(cutL<cutR){
              cut1 = (cutR-cutL)/2+cutL;
              cut2 = len/2-cut1;
              double l1 = (cut1==0)?Integer.MIN_VALUE:nums1[cut1-1];
              double l2 = (cut2==0)?Integer.MIN_VALUE:nums2[cut2-1];
              double r1 = (cut1==0)?Integer.MAX_VALUE:nums1[cut1];
              double r2 = (cut2==0)?Integer.MAX_VALUE:nums2[cut2];
              if(l1<r2){
                  cutR = cut1+1;
              }else if(l2<r1){
                  cutL = cut1-1;
              }else {
                  if (len % 2 == 0) {
                     r1 = (Math.max(l1,l2)+Math.min(r1,r2))/2;
                      return r1;
                  }else{
                     r1 = Math.min(r1,r2);
                     return r1;
                  }
              }
          }
          return -1;
    }
}
