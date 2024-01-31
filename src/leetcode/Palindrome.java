package leetcode;

public class Palindrome {

    static boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;
//        StringBuilder str = new StringBuilder();
//        for(int i=s.length()-1; i>=0; i--){
//            str.append(s.charAt(i));
//        }
//        System.out.println(str);
//        if(s.equals(str.toString())){
//            return true;
//        }
//
//        return false;

//        int len = s.length();
//        for(int i=0; i<len/2; i++){
//            if(s.charAt(i) != s.charAt(len-1-i)){
//                return false;
//            }
//        }
//        return true;

        int left = 0;
        int right = s.length() - 1;
        while (left < right){
            while (!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while (!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));

    }
}
