package leetcode;

public class StringOccurance {
    static int strStr(String haystack, String needle) {
        int hayStackLen = haystack.length();
        int needleLen = needle.length();

        if (needleLen == 0) return 0;

        for(int i=0; i<=hayStackLen - needleLen; i++){
            if(haystack.substring(i, i + needleLen).equals(needle)){
                return i;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        System.out.println(strStr("sabutsad", "sad"));
        System.out.println(strStr("leetcode", "leeto"));
    }
}
