package leetcode;

public class LongestReNum {

    public static String longestReNum1(String s) {
        if (s == null || s.length() <= 0) return s;

        String res = "";
        int max = 0;
        boolean[][] ss = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                String ress = s.substring(j, i + 1);
                boolean a = s.charAt(i) == s.charAt(j);
                boolean b = i - j <= 2 || ss[j + 1][i - 1];
                ss[j][i] = (s.charAt(i) == s.charAt(j)) && (i - j <= 2 || ss[j + 1][i - 1]);
                if (ss[j][i] && (i - j + 1) > max) {
                    res = s.substring(j, i + 1);
                    max = i - j + 1;
                }
            }
        }
        return res;
    }

    static String res = "";

    public static String longestReNum2(String s) {
        if (s == null || s.length() <= 0) return s;
        int left = 0;
        int right = 0;
        for (int i = 0; i < s.length(); i++) {
            helper(s, i - 1, i + 1);
            helper(s, i - 1, i + 2);
        }
        return res;
    }

    public static void helper(String s, int left, int right) {
        if (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            if ((right - left + 1) > res.length()) {
                res = s.substring(left, right + 1);
            }
            helper(s, left - 1, right + 1);
        }
    }

    public static void main(String[] args) {
        String abcba = longestReNum1("ababa");
        String abcba1 = longestReNum2("abccba");
        System.out.println(abcba1);
    }
}
