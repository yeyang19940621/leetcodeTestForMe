package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class lengthOfLongestSubstring {

    public int lengthOfLongestSubstring1(String s){

        int res=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0,j=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            res = Math.max(res,i-j+1);
        }
        return res;
    }

    public int lengthOfLongestSubstring2(String s){

        HashSet<Character> set = new HashSet<>();
        int res = 0;
        for(int i=0,j=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(j++));
            }else{
                set.add(s.charAt(j));
                res = Math.max(res,set.size());
            }
        }
        return res;
    }

}
