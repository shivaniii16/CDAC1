public class Minmax_3 {
    public static void main(String[] args) {
        int[] arr = {10, 7, 28, 50, 5, 75, 17};  // Example array
        
        int max = findMax(arr);
        int min = findMin(arr);
        
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
    
    public static int findMax(int[] arr) {
        int max = arr[0];  // Initialize max with the first element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];  // Initialize min with the first element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
