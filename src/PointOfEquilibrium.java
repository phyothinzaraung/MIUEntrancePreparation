public class PointOfEquilibrium {

    static int f(int[] a){
        if(a.length < 3) return -1;

        int i=0;
        int j=a.length-1;
        int leftSum = a[i];
        int rightSum = a[j];
        int result = 1;

        for(int k=1; k<a.length-2; k++){
            if(leftSum < rightSum){
                i++;
                leftSum += a[i];
                result = i + 1;
            }else {
                j--;
                rightSum += a[j];
                result = j-1;
            }
        }

        if(rightSum == leftSum){
            return result;
        }else return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 10, 3, 4};
        System.out.println("Result: " + f(array));
    }
}
