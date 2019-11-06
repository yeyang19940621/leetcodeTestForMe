package leetcode;

public class RomanToInt {

    public static int romanToInt(String romanNum){
        if(romanNum==null || romanNum.length()==0) return 0;
        if (romanNum.length()==1) return helper(romanNum.charAt(0));

        int res = 0;
        res = res+helper(romanNum.charAt(0));
        for (int i = 1; i <romanNum.length() ; i++) {
            if(helper(romanNum.charAt(i))>helper(romanNum.charAt(i-1))){
                res = res +helper(romanNum.charAt(i))-2*helper(romanNum.charAt(i-1));
            }else {
                res = res+helper(romanNum.charAt(i));
            }
        }
        return res;
    }
    public static int helper(Character c){
        int res =0;
        switch (c){
            case 'I' :return 1;
            case 'V' :return 5;
            case 'X' :return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
        }
        return res;
    }
}
