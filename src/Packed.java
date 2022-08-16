import java.util.ArrayList;

public class Packed {

    static int isPacked(int[ ] a){
        if(a.length==0) return 1;

        if(!isConsecutiveArray(a)) return 0;

        int startElement = a[0];
        int count = 0;
        for(int i=1; i<a.length; i++){
            if(startElement == a[i]){
                count++;
            }

            if(startElement < a[i] || startElement > a[i]){
                startElement = a[i];
                count = 0;
            }

            if(count > startElement){
                return 0;
            }
        }
        return 1;
    }

    static boolean isConsecutiveArray(int[] a){
        int start = a[0];
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(start);
        for(int i=1; i<a.length;i++){
            if(start > a[i]){
                start = a[i];
                arr.add(start);
            }else if(start<a[i]){
                start = a[i];
                arr.add(start);
            }
        }

        if(arr.size() > 2){
            int startElement = arr.get(0);
            for(int j=1; j<arr.size(); j++){
                if(arr.get(j) == startElement){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPacked(new int[]{2,2,3,3,3}));
        System.out.println(isPacked(new int[]{2,2,1}));
        System.out.println(isPacked(new int[]{2,2,1,2,2}));
        System.out.println(isPacked(new int[]{4, 4, 4, 4, 1, 2, 2, 3, 3, 3}));
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 7, 7, 7, 1}));
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 1, 7, 7, 7,7, 7, 7, 7, 7, 7, 7}));
        System.out.println(isPacked(new int[]{}));
    }
}
