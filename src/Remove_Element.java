public class Remove_Element {
    public static void main(String[] args) {

    }

    public int removeElement(int[] nums, int val) {
        int output = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[output++] = nums[i];
            }
        }
        return output;
    }

}
