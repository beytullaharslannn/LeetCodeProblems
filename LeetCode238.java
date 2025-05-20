public class LeetCode238 {
    public static void main(String[] args) {
        int arr2[] = {1,0,2};
        int arr3[] = productExceptSelf(arr2);
        for (int i : arr3) {
            System.out.println(i);
        }
    }
     public static int[] productExceptSelf(int[] nums) {
        int arr1[] = new int[nums.length];
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];
        for(int i =0 ;i<nums.length;i++){
            if(i==0)
            left[i]=1;
            else
            left[i] = nums[i-1]*left[i-1];    
        }
        for(int i = nums.length-1;i>=0;i--){
            if(i==nums.length-1)
            right[i]=1;
            else
            right[i] = nums[i+1]*right[i+1];
        }
        for(int i = 0;i<nums.length;i++){
            arr1[i] = left[i]*right[i];
        }
        

        return arr1;
    }
}
