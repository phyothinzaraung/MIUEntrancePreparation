package leetcode;

public class IntToRoman {
    public static String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] keys = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();

        for (int i=0; i<values.length; i++){
            while (num >= values[i]){
                result.append(keys[i]);
                num -= values[i];
            }
        }

        return result.toString();

    }

    public static void main(String[] args) {
        System.out.println(intToRoman(3)); // Output: "III"
        System.out.println(intToRoman(4)); // Output: "IV"
        System.out.println(intToRoman(9)); // Output: "IX"
        System.out.println(intToRoman(58)); // Output: "LVIII"
        System.out.println(intToRoman(1994)); // Output: "MCMXCIV"
    }
}
