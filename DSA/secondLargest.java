package DSA;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 7, 8, 11, 53, 21};
        int first = arr[0];
        int second_max = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > first) {
                second_max = first;
                first = arr[i];
            } else if (arr[i] < first && arr[i] > second_max) {
                second_max = arr[i];
            }
        }
        if (second_max == -1) {
            System.out.println("No second largest");
        } else {
            System.out.println("Second largest: " + second_max);
        }
    }
}
