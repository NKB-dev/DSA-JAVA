import java.util.Arrays;
public class CyclicSort {
    public static void main(String[] args) {
        int[]arr={1,3,4,2,2};
        CS(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(CS(arr));


    }
    static int CS(int[] nums){
        int  i =0;
        while(i<nums.length){
           int correct = nums[i]-1;

//            int correct = nums[i];
            if (nums[i]<nums.length && nums[i]>0 &&nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else{
                i++;
            }
        }
        for(i =0; i<nums.length;i++ ){
            if(nums[i] != i+1){
                return i;
            }
        }
        return nums.length;
    }



}
