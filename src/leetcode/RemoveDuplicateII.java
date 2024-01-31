package leetcode;

public class RemoveDuplicateII {
    static int removeDuplicates(int[] nums) {
        int index = 1;
        int duplicateCount = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] == nums[i]){
                duplicateCount++;
            }else {
                duplicateCount = 1;
            }

            if(duplicateCount < 3){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,1,2,2,3}));
    }
}
