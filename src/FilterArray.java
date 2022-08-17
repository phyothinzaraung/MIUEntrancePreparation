import java.util.ArrayList;

public class FilterArray {

    static int[] filterArray(int[] a, int n){
        if(n==0) return new int[0];

        String binaryNumber = Integer.toBinaryString(n);

        ArrayList<Integer> filterArr = new ArrayList<>();

        for(int i=binaryNumber.length()-1; i>=0; i--){
            if(Integer.parseInt(String.valueOf(binaryNumber.charAt(i))) == 1){
                if(a.length-1 < binaryNumber.length()-1-i){
                    return null;
                }

                filterArr.add(a[binaryNumber.length()-1-i]);
            }
        }

        System.out.println(filterArr);

        int[] result = new int[filterArr.size()];
        for(int i=0; i<filterArr.size(); i++){
            result[i] = filterArr.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(filterArray(new int[]{9, -9}, 0));
        System.out.println(filterArray(new int[]{9, -9}, 1));
        System.out.println(filterArray(new int[]{9, -9}, 2));
        System.out.println(filterArray(new int[]{9, -9}, 3));
        System.out.println(filterArray(new int[]{9, -9}, 4));
        System.out.println(filterArray(new int[]{9, -9, 5}, 3));
        System.out.println(filterArray(new int[]{0, 9, 12, 18, -6}, 11));
    }
}
