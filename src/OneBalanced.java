public class OneBalanced {

    static int isOneBalanced(int[ ] a){
        int left =0, right =0, mid= 0;
        for(int i=0; i<a.length; i++){
            if(a[i] == 1){
                if(mid == 0) ++left;
                else if(mid > 0) ++right;
            }else {
                if(right > 0) return 0;
                else if(left >= 0) mid++;
            }
        }

        if(left + right == mid) return 1;
        else return 0;
    }


    public static void main(String[] args) {
        System.out.println(isOneBalanced(new int[]{1, 1, 1, 2, 3, -18, 45, 1}));
        System.out.println(isOneBalanced(new int[]{1, 1, 1, 2, 3, -18, 45, 1, 0}));
        System.out.println(isOneBalanced(new int[]{1, 1, 2, 3, 1, -18, 26, 1}));
        System.out.println(isOneBalanced(new int[]{}));
        System.out.println(isOneBalanced(new int[]{3, 4, 1, 1}));
        System.out.println(isOneBalanced(new int[]{1, 1, 3, 4}));
        System.out.println(isOneBalanced(new int[]{3, 3, 3, 3, 3, 3}));
        System.out.println(isOneBalanced(new int[]{1, 1, 1, 1, 1, 1}));
    }
}
