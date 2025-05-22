import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] nums = {2, 1, 2, 4, 0};
        int[] result = nextGreaterElements(nums);

        System.out.println("Sonuç: " + Arrays.toString(result));
    }

    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] r = new int[n];
        Stack<Integer> stack = new Stack<>();
        Arrays.fill(r, -1);
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                int index = stack.pop();
                r[index] = nums[i];
            }
            stack.push(i);
        }

        return r;
    }
}
