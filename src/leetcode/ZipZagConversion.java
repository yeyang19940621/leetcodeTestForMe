package leetcode;

public class ZipZagConversion {

    public static String conver(String s,int numrows){
        if(numrows<=0) return s;

        StringBuilder [] stringBuilders = new StringBuilder[numrows];
        for (int i = 0; i <numrows ; i++) {
            stringBuilders[i]=new StringBuilder("");
        }

        for (int i = 0; i <s.length() ; i++) {
             int index = i%(2*numrows-2);
             index = index<=numrows ? index-1:(2*numrows-index-1);
             stringBuilders[index].append(s.charAt(i));
            for (int j = 0; j <numrows && j!=index ; j++) {
                stringBuilders[index].append(" ");
            }
        }

        return stringBuilders.toString();
    }
}
