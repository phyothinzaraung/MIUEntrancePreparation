import java.util.Arrays;

public class Anagram {
    static int areAnagrams(char [ ] a1, char [ ] a2){
        if(a1.length != a2.length) return 0;

        Arrays.sort(a1);
        Arrays.sort(a2);

        boolean isAnagram = Arrays.equals(a1, a2);

        if(isAnagram){
            return 1;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Result: " + areAnagrams(new char[]{'b', 'i', 'x'}, new char[]{'b', 'i', 'g'}));
    }
}
