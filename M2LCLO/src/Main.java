public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        double average = calculateAverage(numbers);
        System.out.println("The average is: " + average);
    }

    private static double calculateAverage(int[] nums) {
        double sum = 0;
        for (int i = 0; i <= nums.length -1 ; i++) {
            sum += nums[i];
        }
        return sum / nums.length;
    }
}
