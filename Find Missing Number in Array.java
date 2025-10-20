public class FindMissingNumber {

    public static int findMissing(int arr[], int n) {
        int expectedSum = n * (n + 1) / 2; // sum of 1 to n
        int actualSum = 0;

        for (int num : arr)
            actualSum += num;

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 6}; // Missing number is 3
        int n = 6; // because numbers are from 1 to 6

        System.out.println("Missing number: " + findMissing(arr, n));
    }
}
