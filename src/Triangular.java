public class Triangular {

    static int isTriangular(int n){
        if(n<1) return 0;
        int sum = 0;
        for(int j=1; j<n; j++){
            sum += j;
            if(sum == n){
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + isTriangular(16));
    }
}
