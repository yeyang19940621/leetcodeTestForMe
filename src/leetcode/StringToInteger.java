package leetcode;

public class StringToInteger {

    public static int stringToInteger(String s) {
        if (s == null || s.length() <= 0) return 0;
        int res = 0;
        s = s.trim();
        int start = 0;
        int flag = 1;
        char startCharacher = s.charAt(0);
        if (startCharacher == '+') {
            flag = 1;
            start++;
        }
        if (startCharacher == '-') {
            flag = -1;
            start++;
        }
        for (int i = start; i < s.length(); i++) {
            if (s.charAt(i) > '9' || s.charAt(i) < '0') {
                if (flag == 1 && res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if (flag == -1 && res > (Integer.MIN_VALUE) * -1) return Integer.MIN_VALUE;
            }
            res = res*10+s.charAt(i);
        }
        if (flag == 1 && res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (flag == -1 && res > (Integer.MIN_VALUE) * -1) return Integer.MIN_VALUE;
        return flag*res;
    }
}
