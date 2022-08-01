public class OnionArray {

    static int isOnionArray(int[ ] a){
        int j = 0;
        int k= a.length-1;
        boolean isOnionArray = false;

        if(a.length <= 1) return 1;

        for(j=0; j<k;){
            if(j!=k){
                if(a[j] + a[k] <= 10){
                    isOnionArray = true;
                    j++;
                    k--;
                }else {
                    isOnionArray = false;
                    break;
                }
            }
        }

        if(isOnionArray)
            return 1;
        else return 0;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + isOnionArray(new int[]{-2, 5, 0, 5, 12}));
    }
}
