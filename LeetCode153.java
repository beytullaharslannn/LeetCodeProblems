public class LeetCode153 {
    public static void main(String[] args) {
        int arr[] = {2,1};
        System.out.println("s");
        System.out.println(findMin(arr));
    }
    public static int findMin(int[] nums) {
        int left = 0 ;
        int right = nums.length-1;
        while(left<right){
            int mid = (left+right)/2;
       
            if(nums[mid]>nums[right])
                left= mid+1;

            else if(nums[mid]<nums[right])
                right = mid;
           
        
        }
        return nums[left];
    } 
}
