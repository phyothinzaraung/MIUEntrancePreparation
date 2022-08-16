public class MadhavArray {

    //Solution1
    static int isMadhavArray(int[] a){
        int n =2;
        boolean isCorrectLength = false;
        while (n*(n+1) <= 2*a.length){
            if(n*(n+1) == 2*a.length){
                isCorrectLength = true;
                break;
            }else {
                n++;
            }
        }

        if(isCorrectLength){
            int num = 2;

            for(int i=1; i<a.length; ){
                int sum = 0;
                for(int j=i; j<num+i; j++){
                    sum += a[j];
                }
                if(sum != a[0]){
                    return 0;
                }
                i += num++;
            }
            return 1;
        }else {
            return 0;
        }
    }

    public static void main(String[] args){
        int[] array = new int[]{3, 1, 2, 3, 0} ;
        int madhavResult = isMadhavArray(array);
        System.out.println("Result is " + madhavResult);
    }

    //Solution2
    static int isMadHavArray(int[ ] a){
        if(isCorrectLength(a)){
            int num = 2;
            for(int i=1; i<a.length;){
                int sum = 0;
                for(int j=i; j<num+i; j++){
                    sum += a[j];
                }
                if(sum != a[0]){
                    return 0;
                }else {
                    i += num++;
                }
            }
            return 1;
        }else {
            return 0;
        }
    }

    static boolean isCorrectLength(int[] a){
        int n=2;
        while ( n*(n+1) <= a.length*2){
            if( n*(n+1) == a.length*2){
                return true;
            }else {
                n++;
            }
        }
        return false;
    }
}

//Time Complexity
//Worst Case O(n+1) that is O(n) it needs to loop until the size of array to get the result
//Best Case O(1) for length of the array is not correct, it returns the result.
