import java.lang.reflect.Array;
import java.util.ArrayList;

public class Mercurial {

    static int isMercurial(int[ ] a){
//        ArrayList<Integer> index1Arr = new ArrayList<>();
//        ArrayList<Integer> index3Arr = new ArrayList<>();
//        boolean isMercurial = true;
//
//        for(int i=0; i< a.length; i++){
//            if(a[i] == 1){
//                index1Arr.add(i);
//            }
//            if(a[i] == 3){
//                index3Arr.add(i);
//            }
//        }
//
//        System.out.println(index1Arr);
//        System.out.println(index3Arr);
//
//        if(index1Arr.size() > 1 || index3Arr.size()>1){
//            for(int i=0; i<index1Arr.size();){
//                for(int j=0; j< index3Arr.size();){
//                    if(index3Arr.get(i) > index1Arr.get(i)){
//
//                    }
//                }
//            }
//        }
//
//        if(isMercurial){
//            return 1;
//        }else return 0;

        boolean isFirstOne = false;
        boolean existsThree = false;
        boolean isLastOne = false;

        for(int i: a){
            if(!isFirstOne){
                if(i==1){
                    isFirstOne = true;
                }
                continue;
            }

            if(!existsThree){
                if(i==3){
                    existsThree = true;
                }
                continue;
            }
            if(!isLastOne){
                if(i==1){
                    isLastOne = true;
                }
            }
        }

        if(isFirstOne && existsThree && isLastOne) return 0;

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isMercurial(new int[]{1, 2, 10, 3, 15, 1, 2, 2}));
        System.out.println(isMercurial(new int[]{5, 2, 10, 3, 15, 1, 2, 2}));
        System.out.println(isMercurial(new int[]{1, 2, 10, 3, 15, 16, 2, 2}));
        System.out.println(isMercurial(new int[]{3, 2, 18, 1, 0, 3, -11, 1, 3}));
        System.out.println(isMercurial(new int[]{2, 3, 1, 1, 18}));
        System.out.println(isMercurial(new int[]{8, 2, 1, 1, 18, 3, 5}));
        System.out.println(isMercurial(new int[]{3, 3, 3, 3, 3, 3}));
        System.out.println(isMercurial(new int[]{1}));
        System.out.println(isMercurial(new int[]{}));
    }
}
