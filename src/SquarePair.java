public class SquarePair {

    static int countSquarePair(int[] a){
        int count = 0;

       if (a.length < 2)  return 0;

       for(int i=0; i<a.length; i++){
           for(int j=i+1; j<a.length; j++){
               if(a[i] > 0 && a[j] > 0){
                   int sum = a[i] + a[j];
                   double squareValue = Math.sqrt(sum);
                   if(squareValue % 1 == 0){
                       count++;
                   }
               }
           }

       }
       return count;
    }

    public static void main(String[] args){
        int[] array = new int[]{11, 5, 4, 20};
        int result = countSquarePair(array);
        System.out.println("Result: " + result);
    }
}
