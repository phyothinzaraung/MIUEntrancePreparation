package leetcode;

public class RemoveSortedDuplicate {

    static int removeDuplicates(int[] nums) {
        int index = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] != nums[i]){
                nums[index] = nums[i];
                index++;
            }
        }
        for (int i=0; i<index; i++){
            System.out.print(nums[i]);
        }
        System.out.println();

        return index;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,2,2}));
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,3,3,4}));
    }
}
